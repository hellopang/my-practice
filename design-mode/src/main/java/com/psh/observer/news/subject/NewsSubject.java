package com.psh.observer.news.subject;

import com.psh.observer.news.observer.NewsObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 新闻主题
 *
 * @author psh 2023/5/12 21:53
 */
public class NewsSubject implements Subject {

	private List<NewsObserver> observers;

	private String article;

	public NewsSubject() {
		observers = new ArrayList<>(20);
	}

	/**
	 * 更新新闻时，直接通知所有
	 */
	public void setArticleAndNotifyAll(String article) {
		this.article = article;
		notifyObservers();
	}

	@Override
	public void registerObserver(NewsObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(NewsObserver observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		if (article == null) {
			return;
		}
		for (NewsObserver observer : observers) {
			observer.update(article);
		}
		this.article = null;
	}

}
