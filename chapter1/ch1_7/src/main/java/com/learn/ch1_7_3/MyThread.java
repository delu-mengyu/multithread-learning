package com.learn.ch1_7_3;

/**
 * @ClassName: MyThread
 * @Description: 1.7.3 异常停止
 * @author dongzhou
 * @date 2018年2月1日 下午1:58:00
 */
class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("已经是停止状态了，我要退出！");
					// 使用break，在跳出循环后，会再次执行for后面的代码，该线程没有被听停止
					// break;
					throw new InterruptedException();
				}
				System.out.println("i = " + (i + 1));
			}
			System.out.println("我被输出了，如果此处有for循环代码又继续运行，线程并未停止");
		} catch (InterruptedException e) {
			System.out.println("捕获到了手动抛出的异常，来到了catch中！");
			e.printStackTrace();
		}
	}
}
