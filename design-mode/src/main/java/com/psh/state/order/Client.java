package com.psh.state.order;

/**
 * 客户端使用
 *
 * @author psh 2023/5/16 22:26
 */
public class Client {

	public static void main(String[] args) {
		Order order = new Order();
		order.confirm(); // 输出：订单已确认
		order.cancel(); // 输出：订单已取消
		order.confirm(); // 输出：订单已取消，无法再次确认
	}

}
