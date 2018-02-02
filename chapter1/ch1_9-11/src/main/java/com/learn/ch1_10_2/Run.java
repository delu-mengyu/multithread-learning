package com.learn.ch1_10_2;

/**
 * @ClassName: Run
 * @Description: 1.10.2 线程优先级的规则性
 * @author dongzhou
 * @date 2018年2月2日 下午5:06:55
 */
public class Run {
	public static void main(String[] args) {
		t1();
	}
	
	/*
	 * 线程的优先级和代码的执行顺序无关
	 * CPU会尽量将资源向优先级高的线程方向倾斜
	 * 优先级高的线程不一定每次都先执行完
	 * 线程的优先级具有随机性
	 */
	public static void t1() {
		for (int i = 0; i < 5; i++) {
			MyThread m1 = new MyThread();
			m1.setPriority(5);
			m1.start();
			MyThread2 m2 = new MyThread2();
			m2.setPriority(6);
			m2.start();
		}
	}
}
