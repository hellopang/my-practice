package com.psh.adapter.one;

/**
 * @author psh 2023/5/9 22:56
 */
public class Client {

	public static void main(String[] args) {
		Adaptee adaptee = new AdapteeImpl();
		Target target = new Adapter(adaptee);
		target.targetMethod();
	}

}
