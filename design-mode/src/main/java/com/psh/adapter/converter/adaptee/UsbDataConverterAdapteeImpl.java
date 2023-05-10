package com.psh.adapter.converter.adaptee;

/**
 * @author psh 2023/5/10 20:21
 */
public class UsbDataConverterAdapteeImpl implements DataConverterAdaptee {

	@Override
	public void transferData() {
		System.out.println("USB 接口传输数据......");
	}

}
