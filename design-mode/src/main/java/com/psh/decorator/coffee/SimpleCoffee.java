package com.psh.decorator.coffee;

import java.math.BigDecimal;

/**
 * 现在如果相对咖啡加工 添加其他的酌料 但是现在并没有入口, 可以使用适配器模式 去适配各种酌料
 *
 * @author psh 2023/5/7 19:36
 */
public class SimpleCoffee implements Coffee {

	@Override
	public BigDecimal cost() {
		return BigDecimal.valueOf(10);
	}

	@Override
	public String description() {
		return "基础咖啡";
	}

}
