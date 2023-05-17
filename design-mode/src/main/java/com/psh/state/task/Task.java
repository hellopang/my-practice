package com.psh.state.task;

import com.psh.state.task.enums.ActionType;
import com.psh.state.task.state.State;
import com.psh.state.task.state.TaskInit;
import lombok.Data;

/**
 * 任务类
 *
 * @author psh 2023/5/16 22:49
 */
@Data
public class Task {

	private Long taskId;

	/**
	 * 初始化为初始态
	 */
	private State state = new TaskInit();

	/**
	 * 更新状态
	 */
	public void updateState(ActionType actionType) {
		state.update(this, actionType);
	}

}
