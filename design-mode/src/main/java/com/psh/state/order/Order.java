package com.psh.state.order;

import com.psh.state.order.state.OrderState;
import com.psh.state.order.state.PendingOrderState;

/**
 * @author psh 2023/5/16 20:25
 */
public class Order {

	private OrderState state;

	public Order() {
		this.state = new PendingOrderState();
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public void confirm() {
		state.confirm(this);
	}

	public void cancel() {
		state.cancel(this);
	}

}
