package com.concurrent.demo;

/**
 * 数组查找 1.基本查找:数组元素无序(从头找到尾) 2.二分查找:数组元素有序(折半查找)
 *
 * @author wangyong
 * @date 2018年04月07日
 */
public class ArrayDemo {

  public static void main(String[] args) {
    int[] intArray = new int[]{11, 22, 33, 44, 55, 66, 77};

    int minIndex = 0;
    int maxIndex = intArray.length - 1;
    int middleIndex;

    //查询22的索引位置
    int findValue = 111;

//    while (intArray[middleIndex] != findValue) {
//      //从左边开始找
//      if (intArray[middleIndex] > findValue) {
//        maxIndex = middleIndex - 1;
//      }
//      //从右边开始找
//      else {
//        minIndex = middleIndex + 1;
//      }
//
//      if (minIndex > maxIndex) {
//        middleIndex = -1;
//        break;
//      }
//      middleIndex = (minIndex + maxIndex) / 2;
//    }

    for (middleIndex = (minIndex + maxIndex) / 2;
        intArray[middleIndex] != findValue;
        middleIndex = (minIndex + maxIndex) / 2) {

      //从左边开始查找
      if (intArray[middleIndex] > findValue) {
        maxIndex = middleIndex - 1;
      }

      //从右边开始查找
      else {
        minIndex = middleIndex + 1;
      }

      if (minIndex > maxIndex) {
        middleIndex = -1;
        break;
      }

    }

    System.out.format("%s所在的index位置为:%s", findValue, middleIndex);

  }


}
