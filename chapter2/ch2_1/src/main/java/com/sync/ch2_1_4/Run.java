package com.sync.ch2_1_4;

/**
 * @ClassName: Run
 * @Description: 2.1.4 syncronized和锁对象
 * @author dongzhou
 * @date 2018年2月6日 下午5:25:45
 */
public class Run {
	/*
	 * A线程先持有object对象的Lock锁，但是B仍可调用object对象中非synchronized类型的方法
	 * A线程现持有object对象的Lock所以，B若此时调用object对象中synchronized类型的方法，仍需同步
	 */

	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(object);
		a.setName("A");
		ThreadB b = new ThreadB(object);
		b.setName("B");
		a.start();
		b.start();
	}
}
