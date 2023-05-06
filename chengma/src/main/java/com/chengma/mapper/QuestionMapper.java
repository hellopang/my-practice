package com.chengma.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.chengma.core.entity.Question;
import com.chengma.core.qo.QuestionQO;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;

/**
 * @author psh
 * @date 2023/4/13 10:08
 */
public interface QuestionMapper extends BaseMapper<Question> {

	/**
	 * 通过QO构造Wrapper
	 * @param qo 条件对象
	 * @return Wrapper
	 */
	default Wrapper<Question> buildWrapperByQO(QuestionQO qo) {
		return Wrappers.lambdaQuery(Question.class)
				// Id
				.eq(qo.getId() != null, Question::getId, qo.getId())
				// 标题
				.likeRight(StringUtils.hasText(qo.getTitle()), Question::getTitle,
						qo.getTitle())
				// 状态
				.eq(qo.getStatus() != null, Question::getStatus, qo.getStatus())
				// delete
				.eq(Question::getDeleteFlag, 0);

	}

	/**
	 * 分页条件查询
	 * @param pageParam 分页参数
	 * @param wrapper 条件对象
	 * @return IPage<Question> 分页数据
	 */
	IPage<Question> page(IPage<?> pageParam,
			@Param(Constants.WRAPPER) Wrapper<Question> wrapper);

}
