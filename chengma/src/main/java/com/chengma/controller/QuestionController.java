package com.chengma.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chengma.core.common.R;
import com.chengma.core.entity.Question;
import com.chengma.core.qo.QuestionQO;
import com.chengma.core.vo.QuestionVO;
import com.chengma.service.QuestionService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 问题接口
 *
 * @author psh 2023/4/13 10:16
 */
@RequestMapping("/question")
@RestController
@RequiredArgsConstructor
public class QuestionController {

	private final QuestionService questionService;

	/**
	 * 分页条件查询
	 * @param pageParam 分页参数
	 * @param qo 条件对象
	 * @return IPage<Question> 分页数据
	 */
	@ApiOperation("问题分页查询")
	@GetMapping("/page")
	public R<IPage<QuestionVO>> page(Page<Question> pageParam, QuestionQO qo) {
		return R.ok(questionService.page(pageParam, qo));
	}

}
