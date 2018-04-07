package com.concurrent.demo;

import com.concurrent.demo.domain.UserDO;
import java.util.HashMap;

/**
 * HashMap 内部数据结构是Entry数组,每一个entry包含一个key-value键值对.
 *
 * @author wangyong
 * @date 2018年04月02日
 */
public class HashMapExample {


  public static void main(String[] args) {

    HashMap<String, String> strHashMap = new HashMap<>();

    UserDO userDO = new UserDO();
    System.out.println(userDO.hashCode());

    UserDO user = new UserDO();
    System.out.println(user.hashCode());

//    strHashMap.replace()

  }

}
