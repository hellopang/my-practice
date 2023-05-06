package com.chengma.core.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author psh 2023/4/13 14:55
 */
@Setter
@Getter
public class QuestionVO {

	private static final long serialVersionUID = 2587158859725090765L;

	private String id;

	/**
	 * 提问标题
	 */
	private String title;

	/**
	 * 标签
	 */
	private String tags;

	/**
	 * 标签
	 */
	private List<String> tagList;

	/**
	 * 问题(关联tb_editor_data表)
	 */
	private Integer question;

	/**
	 * 答案(关联tb_editor_data表),未回答为0
	 */
	private Integer answer;

	/**
	 * 状态：1.已上架 0已下架
	 */
	private Integer status;

	/**
	 * 问题回复人
	 */
	private String answerer;

	/**
	 * 是否精品
	 */
	private Integer classic;

	/**
	 * 创建者
	 */
	private String createUser;

	/**
	 * 创建时间
	 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createTime;

	/**
	 * 更新者
	 */
	private String updateUser;

	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updateTime;

}
