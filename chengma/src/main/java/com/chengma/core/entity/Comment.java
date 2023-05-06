package com.chengma.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 评论表
 *
 * @author psh
 * @date 2023-04-12
 */

@Data
@Accessors(chain = true)
@TableName("tb_comment")
public class Comment implements Serializable {

	private static final long serialVersionUID = 2275631797553888758L;

	private Integer id;

	/**
	 * 评论，关联tb_editor_data
	 * @see EditorData#getId()
	 */
	private Integer comment;

	/**
	 * 评论的question
	 */
	private String questionId;

	/**
	 * 回复的评论ID，为0则为问题的首评
	 */
	private Integer replyId;

	/**
	 * 创建时间
	 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createTime;

	/**
	 * 创建用户
	 */
	private String createUser;

}
