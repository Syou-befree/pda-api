package com.proud.adminapi.controller;

import com.proud.adminapi.model.response.Response;
import com.proud.adminapi.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/member")
public class MemberController {

  @Autowired
  protected MemberService memberService;

  @RequestMapping(value = "/allList", method = RequestMethod.GET)
  public Response getAllList(){

    return memberService.getMemberList();
  }
}
