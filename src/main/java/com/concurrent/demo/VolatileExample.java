package com.concurrent.demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * volatile 轻量级的同步机制,同synchronized相比,更轻量. 修改的属性字段,保证线程的可见性 共享变量存储在主内存中,每个线程运行时都有一个私有的本地内存,线程内部会持有使用主内存的一个副本,
 * 线程运行时对变量的操作是在私有内存中进行的,不能直接读写主内存. 使用volatile变量会强制在线程中的私有内存刷新到主内存,这个操作会导致其它线程的内存无效
 *
 * @author ${user}
 * @date ${date}
 */
public class VolatileExample {

  static volatile int num = 0;


//  static AtomicInteger atomicInteger = new AtomicInteger(0);

  static CountDownLatch countDownLatch = new CountDownLatch(2);


  public static void main(String[] args) throws InterruptedException {

//    num++;
//    int getValue = atomicInteger.incrementAndGet();
//    System.out.println(getValue);

//    for (int i = 0; i < 10000; i++) {
//      new Thread(() -> {
//        num++;
//        countDownLatch.countDown();
//      }).start();
//    }
    countDownLatch.await();
    System.out.println(num);

//    for (int i = 0; i < 10; i++) {
//
//      new Thread(() -> {
//        for (int j = 0; j < 10000; j++) {
//          num++;
//        }
//        countDownLatch.countDown();
//      }).start();
//    }
//
//    countDownLatch.await();
//    System.out.println(num);
  }


}


