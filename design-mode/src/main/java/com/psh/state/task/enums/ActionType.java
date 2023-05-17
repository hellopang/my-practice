package com.psh.state.task.enums;

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
	 * 开始
	 */
	START(1, "开始"),

	/**
	 * 暂停
	 */
	PAUSED(2, "暂停"),

	/**
	 * 完成
	 */
	ACHIEVE(3, "完成"),

	/**
	 * 过期
	 */
	EXPIRE(4, "过期"),

	;
	private final int code;

	private final String message;

}
