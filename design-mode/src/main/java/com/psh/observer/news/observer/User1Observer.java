package com.psh.observer.news.observer;

/**
 * @author psh 2023/5/12 22:00
 */
public class User1Observer implements NewsObserver {

	@Override
	public void update(String news) {
		System.out.println("User-1 收到推送的新闻: " + news);
	}

}
