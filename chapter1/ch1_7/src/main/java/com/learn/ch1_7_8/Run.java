package com.learn.ch1_7_8;

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

	/*
	 * 通过return方法停止和抛出异常效果类似，只是不具备catch捕获向上传播的效果
	 */
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
