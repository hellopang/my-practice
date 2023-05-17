package com.psh.state.task.state;

import com.psh.state.task.enums.ActionType;
import com.psh.state.task.service.ActivityService;
import com.psh.state.task.Task;
import com.psh.state.task.service.TaskManager;

/**
 * 进行中状态
 *
 * @author psh 2023/5/17 22:24
 */
public class TaskOngoing implements State {

	private ActivityService activityService;

	private TaskManager taskManager;

	@Override
	public void update(Task task, ActionType actionType) {

		// 进行中 -> 完成
		if (actionType == ActionType.ACHIEVE) {
			task.setState(new TaskFinished());
			// 完成则通知
			Long taskId = task.getTaskId();
			activityService.notifyFinished(taskId);
			taskManager.release(taskId);
		}
		// 进行中 -> 暂停
		else if (actionType == ActionType.PAUSED) {
			task.setState(new TaskPaused());
		}
		// 进行中 -> 过期
		else if (actionType == ActionType.EXPIRE) {
			task.setState(new TaskExpired());
		}

	}

}
