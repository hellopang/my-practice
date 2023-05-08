package com.psh.strategy.quota.one;

import com.psh.strategy.quota.one.strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author psh 2023/5/6 17:01
 *
 * 额度选择环境类
 */
public class QuotaStrategyContext {

	private static final Map<Integer, QuotaStrategy> REGISTER_MAP = new HashMap<>(4);

	static {
		REGISTER_MAP.put(QuotaEnum.GE_5000.getType(), new Ge_5000_Strategy());

		REGISTER_MAP.put(QuotaEnum.GT_5000_GE_10000.getType(),
				new Gt_5000_Ge_10000_Strategy());

		REGISTER_MAP.put(QuotaEnum.GT_10000_GE_30000.getType(),
				new Gt_10000_Ge_30000_Strategy());

		REGISTER_MAP.put(QuotaEnum.GT_30000_GE_50000.getType(),
				new Gt_30000_Ge_50000_Strategy());
	}

	/**
	 * 注册策略
	 */
	public static void registerStrategy(QuotaEnum quotaEnum,
			QuotaStrategy quotaStrategy) {
		REGISTER_MAP.putIfAbsent(quotaEnum.getType(), quotaStrategy);
	}

	/**
	 * 1、后续策略类注册 spring bean，不同再去 2、获取 QuotaStrategy 所有子类, 动态返回实例
	 */
	public static QuotaStrategy getStrategy(QuotaEnum quotaEnum) {
		return REGISTER_MAP.get(quotaEnum.getType());
	}

}
