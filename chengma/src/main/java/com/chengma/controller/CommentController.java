package com.chengma.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chengma.core.common.R;
import com.chengma.core.entity.Comment;
import com.chengma.core.qo.CommentQO;
import com.chengma.core.vo.CommentVO;
import com.chengma.core.dto.CommentAddDTO;
import com.chengma.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 评论接口
 *
 * @author psh
 * @date 2023/4/12 19:14
 */
@RequestMapping("/comment")
@RestController
@RequiredArgsConstructor
public class CommentController {

	private final CommentService commentService;

	@Value("${active.name}")
	private String activeName;

	/**
	 * 评论列表分页
	 * @param pageParam 分页对象
	 * @param qo 查询条件
	 * @return IPage<CommentVO> 分页数据
	 */
	@GetMapping("/page")
	public R<IPage<CommentVO>> pageVO(Page<Comment> pageParam, CommentQO qo) {
		return R.ok(commentService.pageVO(pageParam, qo));
	}

	/**
	 * 新增评论
	 * @param dto 新增DTO对象
	 */
	@PostMapping
	public R<Void> add(@Validated @RequestBody CommentAddDTO dto) {
		return R.ok();
	}

}
