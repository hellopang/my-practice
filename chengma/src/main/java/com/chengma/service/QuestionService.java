package com.chengma.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chengma.core.entity.Question;
import com.chengma.core.qo.QuestionQO;
import com.chengma.core.vo.QuestionVO;

/**
 * @author psh 2023/4/13 10:12
 */
public interface QuestionService extends IService<Question> {

	/**
	 * 分页条件查询
	 * @param pageParam 分页参数
	 * @param qo 条件对象
	 * @return IPage<Question> 分页数据
	 */
	IPage<QuestionVO> page(Page<Question> pageParam, QuestionQO qo);

}
