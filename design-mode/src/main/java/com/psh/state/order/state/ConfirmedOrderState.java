package com.psh.state.order.state;

import com.psh.state.order.Order;

/**
 * 确认状态
 *
 * @author psh 2023/5/16 21:19
 */
public class ConfirmedOrderState implements OrderState {

	@Override
	public void confirm(Order order) {
		System.out.println("订单已确认，无需再次确认");
	}

	@Override
	public void cancel(Order order) {
		order.setState(new CancelledOrderState());
		System.out.println("订单已取消");
	}

}
