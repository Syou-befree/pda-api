package com.proud.adminapi.service.impl;

import com.proud.adminapi.dao.entity.User;
import com.proud.adminapi.dao.repository.PasswordRepository;
import com.proud.adminapi.dao.repository.UserRepository;
import com.proud.adminapi.model.request.LoginForm;
import com.proud.adminapi.model.response.Response;
import com.proud.adminapi.model.response.UserLogin;
import com.proud.adminapi.service.LoginService;
import com.proud.adminapi.service.TokenService;
import com.proud.adminapi.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  TokenService tokenService;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordRepository passwordRepository;

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

}
