package com.psh.state.order.state;

import com.psh.state.order.Order;

/**
 * 待确认状态
 *
 * @author psh 2023/5/16 21:17
 */
public class PendingOrderState implements OrderState {

	@Override
	public void confirm(Order order) {
		order.setState(new ConfirmedOrderState());
		System.out.println("订单已确认");
	}

	@Override
	public void cancel(Order order) {
		order.setState(new CancelledOrderState());
		System.out.println("订单已取消");
	}

}
