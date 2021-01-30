package com.proud.adminapi.exception;

import com.proud.adminapi.model.response.ErrorMsg;
import com.proud.adminapi.util.ResponseUtil;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseBody
  public List<ErrorMsg> exception(MethodArgumentNotValidException e) {
    BindingResult bindingResult = e.getBindingResult();
    List<ObjectError> allErrors = bindingResult.getAllErrors();
    List<ErrorMsg> errorMsgs = new ArrayList<>();

    allErrors.forEach(objectError -> {
      ErrorMsg errorMsg = new ErrorMsg();
      FieldError fieldError = (FieldError)objectError;
      errorMsg.setField(fieldError.getField());
      errorMsg.setObjectName(fieldError.getObjectName());
      errorMsg.setMessage(fieldError.getDefaultMessage());
      errorMsgs.add(errorMsg);
    });
    return errorMsgs;
  }

  @ResponseBody
  @ExceptionHandler(Exception.class)
  public Object handleException(Exception e) {
    String msg = e.getMessage();
    if (msg == null || msg.equals("")) {
      msg = "システムエラー";
    }

    return ResponseUtil.error(500, msg);
  }
}
