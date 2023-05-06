package com.psh.strategy.quota.core;

import com.psh.strategy.quota.strategy.QuotaStrategy;

/**
 * @author psh 2023/5/6 17:59
 */
public class QuotaService {

	@SuppressWarnings("ALL")
	public Quota execute(Integer quotaType) {

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

}
