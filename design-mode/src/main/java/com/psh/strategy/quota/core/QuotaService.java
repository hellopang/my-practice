package com.psh.strategy.quota.core;

import com.psh.strategy.quota.one.QuotaContext;
import com.psh.strategy.quota.one.QuotaEnum;
import com.psh.strategy.quota.one.strategy.QuotaStrategy;
import com.psh.strategy.quota.two.QuotaSimpleStrategy;

/**
 * @author psh 2023/5/6 17:59
 */
public class QuotaService {

	/**
	 * 第一种实现方式
	 */
	@SuppressWarnings("ALL")
	public Quota firstKindExecute(Integer quotaType) {

		Quota source = new Quota();

		QuotaEnum quotaEnum = QuotaEnum.of(quotaType);
		if (quotaEnum == null) {
			throw new RuntimeException("未找到对应额度策略枚举!");
		}

		QuotaStrategy quotaStrategy = QuotaContext.getStrategy(quotaEnum);
		if (quotaStrategy == null) {
			throw new RuntimeException("未找到对应额度策略!");
		}

		return quotaStrategy.setParam(source);
	}

	/**
	 * 第二种实现方式
	 */
	@SuppressWarnings("ALL")
	public Quota secondKindExecute(Integer quotaType) {

		Quota source = new Quota();

		QuotaSimpleStrategy quotaSimpleStrategy = QuotaSimpleStrategy.of(quotaType);
		if (quotaSimpleStrategy == null) {
			throw new RuntimeException("未找到对应额度策略枚举!");
		}
		return quotaSimpleStrategy.setParam(source);
	}

}
