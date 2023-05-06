package com.chengma.core.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 问题表
 *
 * @author psh
 * @date 2023-04-12
 */

@Data
@Accessors(chain = true)
@TableName("tb_question")
public class Question implements Serializable {

	private static final long serialVersionUID = 2587158859725090765L;

	private String id;

	/**
	 * 提问标题
	 */
	private String title;

	/**
	 * 标签，多个逗号分隔
	 */
	private String tags;

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

	/**
	 * 是否删除，1为是，0为否
	 */
	@TableLogic(value = "1")
	private Integer deleteFlag;

}
