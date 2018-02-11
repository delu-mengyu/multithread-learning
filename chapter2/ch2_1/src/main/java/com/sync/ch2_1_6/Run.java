package com.sync.ch2_1_6;

/**
 * @ClassName: Run
 * @Description: synchronized锁重入
 * @author dongzhou
 * @date 2018年2月7日 下午2:59:05
 */
public class Run {
	/*
	 * 可重入锁：自己可以再次获取自己的内部锁。 打个比方：有一个线程获取了某个对象的锁，此时对象锁还未释放，当其想要再次获取该对象锁时还说可以获取的，
	 * 如果是不可重入锁，就会造成死锁。 可重入锁也支持在父子类的环境中,子类可以通过可重入锁调用父类的
	 */
	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
	}
}
