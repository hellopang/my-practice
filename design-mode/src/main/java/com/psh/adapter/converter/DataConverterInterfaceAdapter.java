package com.psh.adapter.converter;

import com.psh.adapter.converter.adaptee.DataConverterAdaptee;

/**
 * 转换接口
 *
 * @author psh 2023/5/10 20:25
 */
public class DataConverterInterfaceAdapter implements ComputerTargetInterface {

	private final DataConverterAdaptee adaptee;

	public DataConverterInterfaceAdapter(DataConverterAdaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void receiveData() {
		adaptee.transferData();
		System.out.println("电脑端接收数据......");
	}

}
