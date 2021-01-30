package com.proud.adminapi.service;

import com.proud.adminapi.model.request.LoginForm;
import com.proud.adminapi.model.response.Response;

public interface LoginService {

  Response login(LoginForm loginForm);
}
