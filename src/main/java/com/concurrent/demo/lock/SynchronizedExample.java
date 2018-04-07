package com.concurrent.demo.lock;

/**
 * TODO 大哥,写点注释吧!
 *
 * @author wangyong
 * @date 2018年03月27日
 */
public class SynchronizedExample {

  int value = 0;

  public static void main(String[] args) {
    int i = 0;
    i++;
    System.out.println(i);
  }


  public synchronized int getIntValue() {

    return 0;
  }


  public int getIntVal() {

    synchronized (SynchronizedExample.class) {
      if (value > 0) {
        return value;
      } else {
        return -1;
      }
    }
  }

}
