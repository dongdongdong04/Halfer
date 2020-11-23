package com.xttblog.cisp.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {

  /**
   * 加密密码
   */
  public static String bryptPwd(String pwd) {
    //return BCrypt.hashpw(pwd, BCrypt.gensalt());
    return pwd;
  }

  /**
   * 校验密码
   */
  public static boolean validPwd(String pwd, String hashed) {
    try {
      //return BCrypt.checkpw(pwd, hashed);
      return pwd.equals(hashed);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
}
