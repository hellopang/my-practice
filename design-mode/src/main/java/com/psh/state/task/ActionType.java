package com.psh.state.task;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 行为枚举
 *
 * @author psh 2023/5/16 22:50
 */
@AllArgsConstructor
@Getter
public enum ActionType {

	/**
	 *
	 */
	START(1, "开始"), STOP(2, "暂停"), ACHIEVE(3, "完成"), EXPIRE(4, "过期");
	private final int code;

	private final String message;

}
