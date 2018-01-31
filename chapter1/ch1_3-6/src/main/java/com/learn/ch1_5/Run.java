package com.learn.ch1_5;

/**
 * @ClassName: Run
 * @Description: 1.5 sleep()
 * @author dongzhou
 * @date 2018年1月31日 下午5:34:37
 */
public class Run {
	/*
	 * sleep()方法时在指定的毫秒数内让线程暂时休眠
	 */

	public static void main(String[] args) {
		t1();
	}

	// 调用run方法时为同步执行，调用start方法时表示线程开始，具体时间由系统决定，所以先执行了begin和end
	public static void t1() {
		MyThread mt = new MyThread();
		System.out.println("begin--" + System.currentTimeMillis());
		// mt.run();
		mt.start();
		System.out.println("end--" + System.currentTimeMillis());

	}
}
