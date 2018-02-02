package com.learn.ch1_10_2;

import java.util.Random;

/**
 * @ClassName: MyThread
 * @Description: 1.10.2 优先级的规则性
 * @author dongzhou
 * @date 2018年2月2日 下午5:06:49
 */
class MyThread extends Thread {
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		long resultAdd = 0;
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 5000; i++) {
				Random random = new Random();
				random.nextInt();
				resultAdd += i;
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("*******thread 1 use time = " + (endTime - beginTime));
	}
}
