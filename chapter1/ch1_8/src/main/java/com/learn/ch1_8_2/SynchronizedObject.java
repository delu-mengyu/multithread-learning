package com.learn.ch1_8_2;

/**
 * @ClassName: SynchronizedObject
 * @Description: 1.8.2 独占测试
 * @author dongzhou
 * @date 2018年2月1日 下午5:19:46
 */
class SynchronizedObject {
	synchronized public void printString() {
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a线程永远被 suspend了 ");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
