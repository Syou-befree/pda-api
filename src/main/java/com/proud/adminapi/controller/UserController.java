package com.proud.adminapi.controller;

import com.proud.adminapi.model.response.Response;
import com.proud.adminapi.model.response.UserInfo;
import com.proud.adminapi.service.UserService;
import com.proud.adminapi.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  protected UserService userService;


  @RequestMapping(value = "/info", method = RequestMethod.GET)
  public Response<UserInfo> getUserInfo(@RequestParam Object token, HttpSession session){
    UserInfo userInfo = new UserInfo();
    userInfo.setName("SHO");
    userInfo.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    userInfo.setIntroduction("I am SHO");
    userInfo.setRoles("admin");
    return ResponseUtil.success(userInfo);
  }

  @RequestMapping(value = "/logout", method = RequestMethod.POST)
  public Response logout(HttpServletRequest req, HttpSession session){
    return ResponseUtil.success();
  }
}
