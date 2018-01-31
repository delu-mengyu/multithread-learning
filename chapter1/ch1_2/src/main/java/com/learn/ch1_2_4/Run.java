package com.learn.ch1_2_4;

/**
 * @ClassName: Run
 * @Description: 1.2.4
 * @author dongzhou
 * @date 2018年1月31日 下午3:30:14
 */
public class Run {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread a = new Thread(mt);
		Thread b = new Thread(mt);
		Thread c = new Thread(mt);
		Thread d = new Thread(mt);
		Thread e = new Thread(mt);

		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
