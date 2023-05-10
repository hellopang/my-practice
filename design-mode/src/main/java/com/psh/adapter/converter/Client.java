package com.psh.adapter.converter;

import com.psh.adapter.converter.adaptee.DataConverterAdaptee;
import com.psh.adapter.converter.adaptee.TypecDataConverterAdapteeImpl;

/**
 * @author psh 2023/5/10 20:37
 */
public class Client {

	public static void main(String[] args) {
		DataConverterAdaptee adaptee = new TypecDataConverterAdapteeImpl();
		ComputerTargetInterface target = new DataConverterInterfaceAdapter(adaptee);
		target.receiveData();
	}

}
