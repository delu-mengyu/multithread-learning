package com.sync.ch2_1_2;

/**
 * @ClassName: Run
 * @Description: 2.1.2 实例变量是非线程安全的
 * @author dongzhou
 * @date 2018年2月5日 上午11:41:55
 */
public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNum num = new HasSelfPrivateNum();
		ThreadA a = new ThreadA(num);
		a.start();
		ThreadB b = new ThreadB(num);
		b.start();
	}
}
