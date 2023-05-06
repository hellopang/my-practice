package com.psh.strategy.quota;

import com.psh.strategy.quota.core.Quota;
import com.psh.strategy.quota.core.QuotaService;

/**
 * @author psh 2023/5/6 17:55
 */
public class Test {

	public static void main(String[] args) {

		QuotaService quotaService = new QuotaService();

		// 第一种实现方式：使用Context类中Map缓存type对应的策略类
		Quota quota1 = quotaService.firstKindExecute(2);
		System.out.println(quota1);

		// 第二种实现方式：基于枚举策略模式，算法封装在枚举实现里面
		Quota quota2 = quotaService.secondKindExecute(3);
		System.out.println(quota2);

	}

}
