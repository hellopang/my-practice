package com.chengma.core.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 问题标签关联表
 *
 * @author psh
 * @date 2023-04-12
 */

@Data
@Accessors(chain = true)
@TableName("tb_question_tag")
public class QuestionTag implements Serializable {

	private static final long serialVersionUID = 3683817250623684262L;

	/**
	 * 标签ID
	 */
	private Integer tagId;

	/**
	 * 问题ID
	 */
	private String questionId;

}
