package com.proud.adminapi.service.impl;

import com.proud.adminapi.dao.entity.UserDetail;
import com.proud.adminapi.dao.repository.UserDetailRepository;
import com.proud.adminapi.model.response.Response;
import com.proud.adminapi.service.MemberService;
import com.proud.adminapi.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

  @Autowired
  private UserDetailRepository userDetailRepository;

  @Override
  public Response getMemberList(){
    List<UserDetail> memberInfoList = userDetailRepository.findAll();

    return ResponseUtil.success(memberInfoList);
  }
}
