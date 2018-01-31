package com.learn.ch1_6;

/**
 * @ClassName: Run
 * @Description: 1.6 getId()方法
 * @author dongzhou
 * @date 2018年1月31日 下午5:47:04
 */
public class Run {
	/*
	 * getId()获取线程唯一标识
	 */

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		System.out.println(th.getName() + "--" + th.getId());
	}

}
