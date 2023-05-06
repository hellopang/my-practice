package com.chengma.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chengma.core.entity.Comment;
import com.chengma.core.qo.CommentQO;
import com.chengma.core.vo.CommentVO;

/**
 * 评论接口
 *
 * @author psh
 * @date 2023/4/12 19:14
 */
public interface CommentService extends IService<Comment> {

	/**
	 * 分页查询
	 * @param pageParam 分页条件
	 * @param qo 查询条件对象
	 */
	IPage<CommentVO> pageVO(Page<Comment> pageParam, CommentQO qo);

}
