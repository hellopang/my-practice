package com.psh.strategy.quota.one;

import lombok.*;

/**
 * @author psh 2023/5/6 16:41
 *
 * 额度枚举: 单位:万元
 */
@Getter
@AllArgsConstructor
public enum QuotaEnum {

	/**
	 * <= 5000万
	 */
	GE_5000(1, "value <= 5000万"),

	/**
	 * 5000万 < value <= 1亿
	 */
	GT_5000_GE_10000(2, "5000万 < value <= 1亿"),

	/**
	 * 1亿 < value <= 3亿
	 */
	GT_10000_GE_30000(3, "1亿 < value <= 3亿"),

	/**
	 * 3亿 < value <= 5亿
	 */
	GT_30000_GE_50000(4, "3亿 < value <= 5亿"),

	;

	private final Integer type;

	private final String desc;

	public static QuotaEnum of(Integer status) {
		for (var e : values()) {
			if (e.getType().equals(status)) {
				return e;
			}
		}
		return null;
	}

}
