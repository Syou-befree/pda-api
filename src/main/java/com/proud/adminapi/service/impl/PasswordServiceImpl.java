package com.proud.adminapi.service.impl;

import com.proud.adminapi.dao.entity.Password;
import com.proud.adminapi.dao.repository.PasswordRepository;
import com.proud.adminapi.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;

public class PasswordServiceImpl implements PasswordService {

  @Autowired
  private PasswordRepository passwordRepository;

  @Override
  public Password findByUserId(String userId) {
    return passwordRepository.findByUserId(userId);
  }
}
