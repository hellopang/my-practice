package com.psh.strategy.quota;

import com.psh.strategy.quota.core.Quota;
import com.psh.strategy.quota.core.QuotaService;

/**
 * @author psh 2023/5/6 17:55
 */
public class Test {

	public static void main(String[] args) {
		Quota quota = new QuotaService().execute(5);
		System.out.println(quota);
	}

}
