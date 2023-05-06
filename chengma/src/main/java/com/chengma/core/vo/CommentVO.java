package com.chengma.core.vo;

import com.chengma.core.entity.Comment;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author psh
 * @date 2023/4/12 20:27
 */
@Setter
@Getter
public class CommentVO {

	private static final long serialVersionUID = 227563179755388678L;

	private Integer id;

	/**
	 * 评论，关联tb_editor_data
	 */
	private String comment;

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

	/**
	 * 子评论
	 */
	private List<Comment> children;

}
