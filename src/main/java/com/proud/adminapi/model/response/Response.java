package com.proud.adminapi.model.response;

import lombok.Data;

@Data
public class Response<T> {

  private Integer code;

  private String msg;

  private T data;

}
