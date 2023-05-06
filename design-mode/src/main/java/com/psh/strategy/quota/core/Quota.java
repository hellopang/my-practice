package com.psh.strategy.quota.core;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author psh 2023/5/6 17:08
 *
 * 主要是为了测试不同额度下对该对象的赋值问题
 */
@Data
@Accessors(chain = true)
public class Quota {

	/**
	 * 描述
	 */
	private String desc;

}
