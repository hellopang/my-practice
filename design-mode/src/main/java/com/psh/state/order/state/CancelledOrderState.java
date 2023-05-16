package com.psh.state.order.state;

import com.psh.state.order.Order;
import com.psh.state.order.state.OrderState;

/**
 * 取消状态
 *
 * @author psh 2023/5/16 21:20
 */
public class CancelledOrderState implements OrderState {

	@Override
	public void confirm(Order order) {
		System.out.println("订单已取消，无法再次确认");
	}

	@Override
	public void cancel(Order order) {
		System.out.println("订单已取消，无法再次取消");
	}

}
