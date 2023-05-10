package com.psh.adapter.converter.adaptee;

/**
 * @author psh 2023/5/10 20:24
 */
public class TypecDataConverterAdapteeImpl implements DataConverterAdaptee {

	@Override
	public void transferData() {
		System.out.println("TypeC 接口传输数据......");
	}

}
