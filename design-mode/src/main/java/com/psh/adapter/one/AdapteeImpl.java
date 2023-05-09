package com.psh.adapter.one;

/**
 * 待适配接口实现类
 *
 * @author psh 2023/5/9 22:53
 */
public class AdapteeImpl implements Adaptee {

	@Override
	public void adapteeMethod() {
		System.out.println("运行待适配接口中的方法");
	}

}
