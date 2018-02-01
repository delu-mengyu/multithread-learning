package com.learn.ch1_7_1;

/**
 * @ClassName: Run
 * @Description: 1.7.1 停止不了的线程，使用interrupt()中止线程
 * @author dongzhou
 * @date 2018年2月1日 上午10:06:45
 */
public class Run {
	public static void main(String[] args) {
		try {
			InterruptThread it = new InterruptThread();
			it.start();
			Thread.sleep(3000);
			// 该方法并不能停止线程
			it.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
