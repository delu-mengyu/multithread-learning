package com.sync.ch2_1_3;

/**
 * @ClassName: Run
 * @Description: 2.1.2 实例变量是非线程安全的
 * @author dongzhou
 * @date 2018年2月5日 上午11:41:55
 */
public class Run {
	public static void main(String[] args) {
		// 同一类的不同对象，JVM会根据不同线程访问的不同对象创建多个锁，与
		HasSelfPrivateNum num1 = new HasSelfPrivateNum();
		HasSelfPrivateNum num2 = new HasSelfPrivateNum();
		ThreadA a = new ThreadA(num1);
		a.start();
		ThreadB b = new ThreadB(num2);
		b.start();
	}
}
