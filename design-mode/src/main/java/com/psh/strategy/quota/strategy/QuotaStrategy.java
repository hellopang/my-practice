package com.psh.strategy.quota.strategy;

import com.psh.strategy.quota.core.QuotaContext;
import com.psh.strategy.quota.core.Quota;
import com.psh.strategy.quota.core.QuotaEnum;

/**
 * @author psh 2023/5/6 17:06
 *
 * 额度策略 每新增一个策略 需要更新Map {@link QuotaContext}
 */
public interface QuotaStrategy {

	/**
	 * 是否支持当前额度类型
	 * @param quotaEnum 额度类型
	 * @return 是否支持当前额度类型
	 */
	boolean support(QuotaEnum quotaEnum);

	/**
	 * 对source参数赋值
	 * @param source 源数据
	 * @return 赋值后并返回当前对象
	 */
	Quota setParam(Quota source);

}
