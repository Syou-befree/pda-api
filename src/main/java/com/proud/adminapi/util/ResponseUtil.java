package com.proud.adminapi.util;

import com.proud.adminapi.model.response.Response;

public class ResponseUtil {

  public static Response success(Object object) {
    Response response = new Response();
    response.setCode(20000);
    response.setMsg("成功しました！");
    response.setData(object);
    return response;
  }

  public static Response success() {
    return success("");
  }

  public static Response error(Integer code, String msg) {
    Response response = new Response();
    response.setCode(code);
    response.setMsg(msg);
    return response;
  }
}
