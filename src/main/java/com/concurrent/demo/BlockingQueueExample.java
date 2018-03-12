package com.concurrent.demo;

import com.concurrent.demo.handler.Consumer;
import com.concurrent.demo.handler.Producer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 堵塞队列 一个线程往里面放置对象，另一个线程从里面取出对象
 *
 * BlockingQueue
 *  --ArrayBlockingQueue
 *    有界堵塞队列（FIFO），底层是通过数组实现的，根据数组的特点，一点设置了容量大小，不可以对容量大小修改
 *  --DelayQueue
 *    延时队列
 *  --LinkedBlockingQueue
 *    链式堵塞队列
 *  --PriorityBlockingQueue
 * --SynchronousQueue
 *
 * @author wangyong
 */
public class BlockingQueueExample {

  public static void main(String[] args) throws InterruptedException {

    BlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<String>(1024);

    new Thread(new Producer(arrayBlockingQueue)).start();
    new Thread(new Consumer(arrayBlockingQueue)).start();

    Thread.sleep(4000);

  }


}
