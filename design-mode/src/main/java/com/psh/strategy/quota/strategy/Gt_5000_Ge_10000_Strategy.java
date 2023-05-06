package com.psh.strategy.quota.strategy;

import com.psh.strategy.quota.core.Quota;
import com.psh.strategy.quota.core.QuotaEnum;

/**
 * @author psh 2023/5/6 17:16
 */
public class Gt_5000_Ge_10000_Strategy implements QuotaStrategy {

	@Override
	public boolean support(QuotaEnum quotaEnum) {
		return QuotaEnum.GT_5000_GE_10000.equals(quotaEnum);
	}

	@Override
	public Quota setParam(Quota source) {
		source.setDesc(QuotaEnum.GT_5000_GE_10000.getDesc());
		return source;
	}

}
