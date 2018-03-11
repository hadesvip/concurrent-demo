package com.concurrent.demo.handler;

import java.util.concurrent.BlockingQueue;

/**
 * 生产者
 *
 * @author wangyong
 */
public class Producer implements Runnable {

  BlockingQueue<String> blockingQueue = null;

  public Producer(BlockingQueue blockingQueue) {
    this.blockingQueue = blockingQueue;
  }

  @Override
  public void run() {

    try {
      blockingQueue.put("1");
      Thread.sleep(1000);
      blockingQueue.put("2");
      Thread.sleep(1000);
      blockingQueue.put("3");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
