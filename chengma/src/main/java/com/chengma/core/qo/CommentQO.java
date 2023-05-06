package com.chengma.core.qo;

import com.chengma.core.entity.EditorData;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 评论查询条件对象
 *
 * @author psh 2023/4/13 11:13
 */
@Getter
@Setter
@Accessors(chain = true)
public class CommentQO {

	private Integer id;

	/**
	 * 评论，关联tb_editor_data
	 *
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

}
