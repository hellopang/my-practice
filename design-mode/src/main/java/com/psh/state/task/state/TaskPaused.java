package com.psh.state.task.state;

import com.psh.state.task.enums.ActionType;
import com.psh.state.task.Task;

/**
 * 暂定状态
 *
 * @author psh 2023/5/17 22:43
 */
public class TaskPaused implements State {

	@Override
	public void update(Task task, ActionType actionType) {

		// 暂定 -> 开始
		if (actionType == ActionType.START) {
			task.setState(new TaskOngoing());
		}
		// 初始化 -> 过期
		else if (actionType == ActionType.EXPIRE) {
			task.setState(new TaskExpired());
		}
	}

}
