package com.kongzi.mode.observer;

/**
 * 观察者2
 */
public class TwoObserver implements Observer {

	@Override
	public void update() {
		System.out.println("观察者2 接收到消息");
		
		System.out.println("观察者2 处理...");		
	}
}
