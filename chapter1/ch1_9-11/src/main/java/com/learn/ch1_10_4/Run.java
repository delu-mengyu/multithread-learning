package com.learn.ch1_10_4;

/**
 * @ClassName: Run
 * @Description: 1.10.4 泡的快
 * @author dongzhou
 * @date 2018年2月2日 下午5:06:55
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThreadA a = new MyThreadA();
			a.setPriority(Thread.NORM_PRIORITY - 3);
			a.start();
			MyThreadA b = new MyThreadA();
			b.setPriority(Thread.NORM_PRIORITY + 3);
			b.start();
			Thread.sleep(2000);
			b.stop();
			a.stop();
			System.out.println("a=" + a.getCount());
			System.out.println("b=" + b.getCount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
