package com.chengma.dto;

import com.chengma.core.entity.EditorData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * 评论新增 DTO
 *
 * @author psh 2023/4/18 17:14
 */
@Getter
@Setter
@ToString
public class CommentAddDTO {

	/**
	 * 评论，关联tb_editor_data
	 * @see EditorData#getId()
	 */
	@NotNull(message = "评论内容不能为空!")
	private Integer comment;

	/**
	 * 评论的question
	 */
	@NotNull(message = "问题Id不能为空!")
	private String questionId;

	/**
	 * 回复的评论ID，为0则为问题的首评
	 */
	private Integer replyId;

}
