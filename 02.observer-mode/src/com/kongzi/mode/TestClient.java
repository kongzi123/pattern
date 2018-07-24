package com.kongzi.mode;

import com.kongzi.mode.observer.OneObserver;
import com.kongzi.mode.observer.TwoObserver;
import com.kongzi.mode.subject.OneSubject;
import com.kongzi.mode.subject.Subject;

/**
 * 观察者模式测试客户端
 * 
 * 定义对象间一种一对多的依赖关系，使得当每一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。
 */
public class TestClient {

	public static void main(String[] args) {
		
		Subject subject = new OneSubject();
		subject.addObserver(new OneObserver());
		subject.addObserver(new TwoObserver());
		
		subject.handle();
	}

}
