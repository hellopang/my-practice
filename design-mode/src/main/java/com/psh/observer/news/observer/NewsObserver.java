package com.psh.observer.news.observer;

/**
 * 新闻观察者
 *
 * @author psh 2023/5/12 21:51
 */
public interface NewsObserver {

	/**
	 * 被观察者（主题）更新通知观察者, 执行的方法
	 * @param news 新闻
	 */
	void update(String news);

}
