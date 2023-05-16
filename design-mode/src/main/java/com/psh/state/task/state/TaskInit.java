package com.psh.state.task.state;

import com.psh.state.task.ActionType;
import com.psh.state.task.Task;

/**
 * 任务初始状态
 *
 * @author psh 2023/5/16 22:47
 */
public class TaskInit implements State {

	@Override
	public void update(Task task, ActionType actionType) {
		State.super.update(task, actionType);
	}

}
