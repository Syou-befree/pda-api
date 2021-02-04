package com.proud.adminapi.model.response;

import lombok.Data;

@Data
public class UserInfo {
  protected String[] roles;
  protected String introduction;
  protected String avatar;
  protected String name;
}
