package com.sync.ch2_1_5;

/**
 * @ClassName: Run
 * @Description: 2.1.5 脏读
 * @author dongzhou
 * @date 2018年2月7日 下午2:34:12
 */
public class Run {

	// 脏读一定会出现操作实例变量的的情况，这就是不同线程在争抢实例变量的结果
	public static void main(String[] args) {
		try {
			PublicVar var = new PublicVar();
			ThreadA a = new ThreadA(var);
			a.start();
			// 当sleep时间小于setValue的sleep时间，就会形成脏读
			Thread.sleep(2000);
			var.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
