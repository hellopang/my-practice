package com.chengma.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 标签表
 *
 * @author psh
 * @date 2023-04-12
 */

@Data
@Accessors(chain = true)
@TableName("tb_tag")
public class Tag implements Serializable {

	private static final long serialVersionUID = 5073456068960225708L;

	/**
	 * ID
	 */
	private Integer id;

	/**
	 * 标签值
	 */
	private String label;

	/**
	 * 点击次数
	 */
	private Integer count;

	/**
	 * 分类
	 */
	private String category;

}
