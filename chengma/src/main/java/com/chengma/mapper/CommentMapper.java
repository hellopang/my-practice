package com.chengma.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.chengma.core.entity.Comment;
import com.chengma.core.qo.CommentQO;
import com.chengma.core.vo.CommentVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;

/**
 * @author psh
 * @date 2023/4/12 19:47
 */
public interface CommentMapper extends BaseMapper<Comment> {

	/**
	 * 通过QO构造Wrapper
	 * @param qo 条件对象
	 * @return Wrapper
	 */
	default Wrapper<Comment> buildWrapperByQO(CommentQO qo) {
		return Wrappers.lambdaQuery(Comment.class)
				// Id
				.eq(qo.getId() != null, Comment::getId, qo.getId())
				// 内容
				.eq(qo.getComment() != null, Comment::getComment, qo.getComment())
				// 问题ID
				.eq(StringUtils.hasText(qo.getQuestionId()), Comment::getQuestionId,
						qo.getQuestionId());

	}

	/**
	 * 分页查询
	 * @param pageParam 分页条件
	 * @param wrapper 查询条件对象
	 * @return 分页数据
	 */
	IPage<CommentVO> pageVO(IPage<?> pageParam,
			@Param(Constants.WRAPPER) Wrapper<Comment> wrapper);

}
