package com.proud.adminapi.service;

import com.proud.adminapi.model.request.LoginForm;

public interface TokenService {

  String getToken(LoginForm user);
}
