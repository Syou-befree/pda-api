package com.proud.adminapi.service;

import com.proud.adminapi.dao.entity.User;

public interface UserService {

  User findByUserId(String userId);

}
