package com.proud.adminapi.controller;

import com.proud.adminapi.annotation.PassToken;
import com.proud.adminapi.model.request.LoginForm;
import com.proud.adminapi.model.response.Response;
import com.proud.adminapi.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class LoginController {

  @Autowired
  protected LoginService loginService;

  @RequestMapping(value = "/user/login", method = RequestMethod.POST)
  @PassToken
  public Response login(@RequestBody @Valid LoginForm loginForm){
    return loginService.login(loginForm);
  }
}
