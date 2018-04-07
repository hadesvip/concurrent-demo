package com.concurrent.demo;

/**
 * TODO 大哥,写点注释吧!
 *
 * @author wangyong
 * @date 2018年03月27日
 */
public class ThreadLocalExample {


  final ThreadLocal<Long> count = new ThreadLocal<Long>() {
    @Override
    protected Long initialValue() {
      return new Long(0);
    }
  };

  public static void main(String[] args) {

    ThreadLocalExample threadLocalExample = new ThreadLocalExample();

//    new Thread(new Runnable() {
//      @Override
//      public void run() {
//        while (true) {
//          System.out
//              .println(Thread.currentThread().getName() + "---" + threadLocalExample.getNext());
//        }
//      }
//    }).start();
  }


  public long getNext() {
    Long value = count.get();
    value++;
    count.set(value);
    return value;
  }

}
