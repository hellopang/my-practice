package com.psh.strategy.quota.one.strategy;

import com.psh.strategy.quota.one.QuotaEnum;
import com.psh.strategy.quota.one.QuotaStrategyContext;

/**
 * 不建议作为默认方法,放入策略接口中 这里需要强制注册
 *
 * @author psh 2023/5/8 20:43
 */
public abstract class AbstractQuotaStrategy implements QuotaStrategy {

	/**
	 * 类注册方法
	 */
	public void register(QuotaEnum quotaEnum) {
		QuotaStrategyContext.registerStrategy(quotaEnum, this);
	}

}
