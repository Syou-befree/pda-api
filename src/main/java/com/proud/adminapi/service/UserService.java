package com.proud.adminapi.service;

import com.proud.adminapi.dao.entity.User;
import com.proud.adminapi.model.request.LoginForm;
import com.proud.adminapi.model.response.Response;

public interface UserService {

  Response login(LoginForm loginForm);

  User findByUserId(String userId);

  Response findByToken(Object token);

}
