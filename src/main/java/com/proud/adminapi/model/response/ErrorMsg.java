package com.proud.adminapi.model.response;

import lombok.Data;

@Data
public class ErrorMsg {

  private String field;
  private String objectName;
  private String message;

}
