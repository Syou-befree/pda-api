package com.proud.adminapi.controller;

import com.proud.adminapi.annotation.PassToken;
import com.proud.adminapi.model.request.LoginForm;
import com.proud.adminapi.model.response.Response;
import com.proud.adminapi.service.UserService;
import com.proud.adminapi.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  protected UserService userService;

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @PassToken
  public Response login(@RequestBody @Valid LoginForm loginForm){
    return userService.login(loginForm);
  }

  @RequestMapping(value = "/info", method = RequestMethod.GET)
  public Response getUserInfo(@RequestParam Object token){
    return userService.findByToken(token);
  }

  @RequestMapping(value = "/logout", method = RequestMethod.POST)
  public Response logout(HttpServletRequest req){
    return ResponseUtil.success();
  }
}
