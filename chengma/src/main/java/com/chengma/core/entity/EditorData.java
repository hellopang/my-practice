package com.chengma.core.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 富文本表
 *
 * @author psh
 * @date 2023-04-12
 */

@Data
@Accessors(chain = true)
@TableName("tb_editor_data")
public class EditorData implements Serializable {

	private static final long serialVersionUID = 4737645663166252808L;

	/**
	 * ID
	 */
	private Integer id;

	/**
	 * html渲染数据
	 */
	private String html;

	/**
	 * 编辑器渲染数据
	 */
	private String raw;

}
