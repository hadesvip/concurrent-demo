package com.concurrent.demo.domain;

/**
 * 用户信息
 *
 * @author wangyong
 * @date 2018年03月29日
 */
public class UserDO {

  private String userId;

  private String userName;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
