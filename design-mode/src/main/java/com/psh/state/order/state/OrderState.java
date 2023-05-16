package com.psh.state.order.state;

import com.psh.state.order.Order;

/**
 * 订单状态
 *
 * @author psh 2023/5/16 20:23
 */
public interface OrderState {

	/**
	 * 确认
	 * @param order 需要操作的订单
	 */
	void confirm(Order order);

	/**
	 * 取消
	 * @param order 需要操作的订单
	 */
	void cancel(Order order);

}
