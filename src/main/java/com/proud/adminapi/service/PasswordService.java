package com.proud.adminapi.service;

import com.proud.adminapi.dao.entity.Password;

public interface PasswordService {

  Password findByUserId(String userId);
}
