package com.psh.observer.news;

import com.psh.observer.news.observer.User1Observer;
import com.psh.observer.news.observer.User2Observer;
import com.psh.observer.news.subject.NewsSubject;

/**
 * @author psh 2023/5/12 22:10
 */
public class Test {

	public static void main(String[] args) {

		// 两个用户
		User1Observer user1Observer = new User1Observer();
		User2Observer user2Observer = new User2Observer();

		// 新闻主题注册两个订阅者
		NewsSubject newsSubject = new NewsSubject();
		newsSubject.registerObserver(user1Observer);
		newsSubject.registerObserver(user2Observer);

		// 有新闻时，通知所有订阅新闻主题者
		newsSubject.setArticleAndNotifyAll("新闻111111111");

		newsSubject.setArticleAndNotifyAll("新闻222222222");

	}

}
