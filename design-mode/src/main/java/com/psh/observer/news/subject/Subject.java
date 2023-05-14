package com.psh.observer.news.subject;

import com.psh.observer.news.observer.NewsObserver;

/**
 * 目标接口
 *
 * @author psh 2023/5/12 21:48
 */
public interface Subject {

	/**
	 * 注册/订阅一个观察者
	 * @param observer 观察者
	 */
	void registerObserver(NewsObserver observer);

	/**
	 * 移除一个观察者
	 * @param observer 观察者
	 */
	void removeObserver(NewsObserver observer);

	/**
	 * 通知所有观察者
	 */
	void notifyObservers();

}
