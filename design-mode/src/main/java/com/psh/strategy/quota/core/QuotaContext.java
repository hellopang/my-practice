package com.psh.strategy.quota.core;

import com.psh.strategy.quota.strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author psh 2023/5/6 17:01
 *
 * 额度选择环境类
 */
public class QuotaContext {

	private static final Map<Integer, QuotaStrategy> STRATEGIES = new HashMap<>(4);

	static {
		STRATEGIES.put(QuotaEnum.GE_5000.getType(), new Ge_5000_Strategy());

		STRATEGIES.put(QuotaEnum.GT_5000_GE_10000.getType(),
				new Gt_5000_Ge_10000_Strategy());

		STRATEGIES.put(QuotaEnum.GT_10000_GE_30000.getType(),
				new Gt_10000_Ge_30000_Strategy());

		STRATEGIES.put(QuotaEnum.GT_30000_GE_50000.getType(),
				new Gt_30000_Ge_50000_Strategy());
	}

	/**
	 * 1、后续策略类注册 spring bean，不同再去 2、获取 QuotaStrategy 所有子类, 动态返回实例
	 */
	public static QuotaStrategy getStrategy(QuotaEnum quotaEnum) {
		return STRATEGIES.get(quotaEnum.getType());
	}

}
