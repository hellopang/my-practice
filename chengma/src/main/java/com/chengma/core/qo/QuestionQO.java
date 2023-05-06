package com.chengma.core.qo;

import lombok.Getter;
import lombok.Setter;

/**
 * 问题查询条件对象
 *
 * @author psh 2023/4/13 11:13
 */
@Getter
@Setter
public class QuestionQO {

	private String id;

	/**
	 * 提问标题
	 */
	private String title;

	/**
	 * 当前登录用户
	 */
	private Integer loginUserId;

	/**
	 * 状态：1.已上架 0已下架
	 */
	private Integer status;

}
