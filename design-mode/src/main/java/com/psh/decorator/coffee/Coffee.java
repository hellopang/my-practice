package com.psh.decorator.coffee;

import java.math.BigDecimal;

/**
 * @author psh 2023/5/7 19:34
 */
public interface Coffee {

	/**
	 * 价格
	 * @return 花费总价
	 */
	BigDecimal cost();

	/**
	 * 描述
	 * @return 描述
	 */
	String description();

}
