package com.learn.ch1_4;

/**
 * @ClassName: Run
 * @Description: 1.4 isAlive()方法判断线程是否存活
 * @author dongzhou
 * @date 2018年1月31日 下午5:34:37
 */
public class Run {

	public static void main(String[] args) {
		t1();
	}

	// 测试线程是否存活
	public static void t1() {
		try {
			MyThread mt = new MyThread();
			// 线程还未开始
			System.out.println("begin--" + mt.isAlive());
			mt.start();
			// sleep 1秒后，线程已经执行结束，这是end就会判断线程已结束死亡
			Thread.sleep(1000);
			// 线程还未结束
			System.out.println("end--" + mt.isAlive());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
