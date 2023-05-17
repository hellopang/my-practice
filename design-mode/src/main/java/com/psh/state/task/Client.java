package com.psh.state.task;

import com.psh.state.task.enums.ActionType;

/**
 * @author psh 2023/5/17 23:08
 */
public class Client {

	public static void main(String[] args) {

		Task task = new Task();
		System.out.println(task.getState());

		task.updateState(ActionType.START);
		System.out.println(task.getState());
	}

}
