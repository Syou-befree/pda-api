package com.proud.adminapi.service.impl;

import com.auth0.jwt.JWT;
import com.proud.adminapi.dao.entity.User;
import com.proud.adminapi.dao.entity.UserDetail;
import com.proud.adminapi.dao.repository.PasswordRepository;
import com.proud.adminapi.dao.repository.UserDetailRepository;
import com.proud.adminapi.dao.repository.UserRepository;
import com.proud.adminapi.model.request.LoginForm;
import com.proud.adminapi.model.response.Response;
import com.proud.adminapi.model.response.UserInfo;
import com.proud.adminapi.model.response.UserLogin;
import com.proud.adminapi.service.TokenService;
import com.proud.adminapi.service.UserService;
import com.proud.adminapi.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserDetailRepository userDetailRepository;

  @Autowired
  TokenService tokenService;

  @Autowired
  private PasswordRepository passwordRepository;

  @Override
  public User findByUserId(String userId){
    return userRepository.findByUserId(userId);
  }

  @Override
  public Response login(LoginForm loginForm) {
    UserLogin userLogin = new UserLogin();
    User user = userRepository.findByUserId(loginForm.getUsername());
    if (Objects.nonNull(user) &&
            "1".equals(user.getActiveFlg()) &&
            user.getPassword().equals(loginForm.getPassword())) {

      String token = tokenService.getToken(loginForm);

      userLogin.setToken(token);
      return ResponseUtil.success(userLogin);

    }
    return ResponseUtil.error(400, "ログインできませんでした。");
  }

  @Override
  public Response findByToken(Object token) {
    UserInfo userInfo = new UserInfo();
    String userId = JWT.decode(token.toString()).getAudience().get(0);
    User user = userRepository.findByUserId(userId);
    UserDetail userDetail = userDetailRepository.findByUserId(userId);
    if(Objects.nonNull(user) && Objects.nonNull(userDetail)){
      userInfo.setName(userDetail.getFirstName() + "" + userDetail.getLastName());
      userInfo.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
      userInfo.setRoles(new String[]{user.getRoleType()});
      userInfo.setIntroduction("");
      return ResponseUtil.success(userInfo);
    }
    return ResponseUtil.error(400, "ユーザ情報が見つかりませんでした。");
  }

}
