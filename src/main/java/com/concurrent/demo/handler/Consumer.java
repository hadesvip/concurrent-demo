package com.concurrent.demo.handler;

import java.util.concurrent.BlockingQueue;

/**
 * 消费者
 * @author wangyong
 */
public class Consumer implements Runnable {

  BlockingQueue<String> blockingQueue=null;

  public Consumer(BlockingQueue<String> blockingQueue) {
    this.blockingQueue = blockingQueue;
  }

  @Override
  public void run() {

    try {
      System.out.println(blockingQueue.take());
      System.out.println(blockingQueue.take());
      System.out.println(blockingQueue.take());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
