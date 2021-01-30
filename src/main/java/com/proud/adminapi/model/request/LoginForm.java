package com.proud.adminapi.model.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

@Data
public class LoginForm implements Serializable {

  @NotBlank(message = "usernameは必須です。")
  private String username;

  @NotBlank(message = "passwordは必須です。")
  private String password;
}
