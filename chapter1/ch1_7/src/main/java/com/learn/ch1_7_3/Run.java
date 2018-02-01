package com.learn.ch1_7_3;

/**
 * @ClassName: Run
 * @Description: 1.7.3 异常停止法
 * @author dongzhou
 * @date 2018年2月1日 下午2:01:44
 */
public class Run {
	public static void main(String[] args) {
		t1();
	}

	// 通过再run中抛出异常来停止线程
	public static void t1() {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
