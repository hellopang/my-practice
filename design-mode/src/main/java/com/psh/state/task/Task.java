package com.psh.state.task;

import com.psh.state.task.state.State;
import com.psh.state.task.state.TaskInit;

/**
 * 任务类
 *
 * @author psh 2023/5/16 22:49
 */
public class Task {

	private Long taskId;

	/**
	 * 初始化为初始态
	 */
	private final State state = new TaskInit();

	/**
	 * 更新状态
	 */
	public void updateState(ActionType actionType) {
		state.update(this, actionType);
	}

}
