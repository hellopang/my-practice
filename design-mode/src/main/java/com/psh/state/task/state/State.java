package com.psh.state.task.state;

import com.psh.state.task.ActionType;
import com.psh.state.task.Task;

/**
 * 任务状态抽象接口
 *
 * @author psh 2023/5/16 22:45
 */
public interface State {

	/**
	 * 默认实现，不做任何处理
	 * @param task 任务
	 * @param actionType 行为类型
	 */
	default void update(Task task, ActionType actionType) {
		// do nothing
	}

}
