package com.concurrent.demo;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * 延时队列
 *
 * @author wangyong
 */
public class DelayQueueExample {

  public static void main(String[] args) throws InterruptedException {

    System.out.println(System.nanoTime());
    DelayQueue queue = new DelayQueue();
    queue.put(new DelayedElement());
    Delayed delayed = queue.take();
    System.out.println(delayed);

  }
}


/**
 * 自定义delayed接口
 *
 * @author wangyong
 */
class DelayedElement implements Delayed {


  @Override
  public long getDelay(TimeUnit unit) {
    System.out.println(unit.convert(2, TimeUnit.NANOSECONDS)-System.nanoTime());
    return unit.convert(10, TimeUnit.NANOSECONDS);
  }

  /**
   * 对比
   */
  @Override
  public int compareTo(Delayed o) {
    return 0;
  }

}
