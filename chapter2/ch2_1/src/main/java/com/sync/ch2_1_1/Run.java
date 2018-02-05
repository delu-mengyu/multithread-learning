package com.sync.ch2_1_1;

/**
 * @ClassName: Run
 * @Description: 2.1.1 方法内部的私有变量是线程安全的
 * @author dongzhou
 * @date 2018年2月5日 上午11:41:55
 */
public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNum num = new HasSelfPrivateNum();
		// 方法中的变量不存在非线程安全的问题，永远是线程安全的----私有变量的特性
		ThreadA a = new ThreadA(num);
		a.start();
		ThreadB b = new ThreadB(num);
		b.start();
	}
}
