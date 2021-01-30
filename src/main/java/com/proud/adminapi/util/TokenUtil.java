package com.proud.adminapi.util;

import com.auth0.jwt.JWT;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class TokenUtil {

  public static String getTokenUserId() {
    String token = getRequest().getHeader("X-Token");// 从 http 请求头中取出 token
    String userId = JWT.decode(token).getAudience().get(0);
    return userId;
  }

  public static HttpServletRequest getRequest() {
    ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
            .getRequestAttributes();
    return requestAttributes == null ? null : requestAttributes.getRequest();
  }
}
