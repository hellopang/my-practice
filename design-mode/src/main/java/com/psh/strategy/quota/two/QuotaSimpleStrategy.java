package com.psh.strategy.quota.two;

import com.psh.strategy.quota.core.Quota;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.var;

/**
 * @author psh 2023/5/7 0:38
 *
 * 基于枚举的策略模式
 */
@Getter
@AllArgsConstructor
public enum QuotaSimpleStrategy {

	/**
	 * value <= 5000万
	 */
	GE_5000(1) {
		@Override
		public Quota setParam(Quota source) {
			return source.setDesc("value <= 5000万");
		}
	},

	/**
	 * 5000万 < value <= 1亿
	 */
	GT_5000_GE_10000(2) {
		@Override
		public Quota setParam(Quota source) {
			return source.setDesc("5000万 < value <= 1亿");
		}
	},

	/**
	 * 1亿 < value <= 3亿
	 */
	GT_10000_GE_30000(3) {
		@Override
		public Quota setParam(Quota source) {
			return source.setDesc("1亿 < value <= 3亿");
		}
	},

	/**
	 * 3亿 < value <= 5亿
	 */

	GT_30000_GE_50000(4) {
		@Override
		public Quota setParam(Quota source) {
			return source.setDesc("3亿 < value <= 5亿");
		}
	};

	private final Integer type;

	public static QuotaSimpleStrategy of(Integer type) {
		for (var e : values()) {
			if (e.getType().equals(type)) {
				return e;
			}
		}
		return null;
	}

	/**
	 * 定义每种额度下设置参数的抽象方法
	 * @param source 源额度数据
	 * @return 根据不同额度设置参数后的额度
	 */
	public abstract Quota setParam(Quota source);

}
