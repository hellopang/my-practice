package com.psh.adapter.one;

/**
 * 实现目标接口的适配器 客户端或者对外使用 都用这个适配器
 *
 * @author psh 2023/5/9 22:55
 */
public class Adapter implements Target {

	private final Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void targetMethod() {
		adaptee.adapteeMethod();
	}

}
