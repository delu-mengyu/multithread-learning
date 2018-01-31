package com.learn.ch1_2_2;

/**
 * @ClassName: MyRunnable
 * @Description: 1.2.2 实现Runnable接口
 * @author dongzhou
 * @date 2018年1月31日 下午1:51:28
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyRunnable -- 运行中");
	}

}
