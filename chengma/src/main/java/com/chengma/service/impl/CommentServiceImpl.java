package com.chengma.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chengma.core.entity.Comment;
import com.chengma.mapper.CommentMapper;
import com.chengma.core.qo.CommentQO;
import com.chengma.service.CommentService;
import com.chengma.core.vo.CommentVO;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author psh
 * @date 2023/4/12 19:34
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
		implements CommentService {

	@Override
	public IPage<CommentVO> pageVO(Page<Comment> pageParam, CommentQO qo) {
		IPage<CommentVO> pageVO = baseMapper.pageVO(pageParam,
				baseMapper.buildWrapperByQO(qo));
		// 设置 children
		this.setPageChildren(pageVO);

		return pageVO;
	}

	private void setPageChildren(IPage<CommentVO> pageVO) {

		List<CommentVO> records = pageVO.getRecords();

		// 需要获取回复评论 Id
		Set<Integer> needGetChildrenId = records.stream().filter(x -> x.getReplyId() != 0)
				.map(CommentVO::getId).collect(Collectors.toSet());
		if (CollectionUtils.isEmpty(needGetChildrenId)) {
			return;
		}

		List<Comment> childrenList = listByIds(needGetChildrenId);
		if (CollectionUtils.isEmpty(childrenList)) {
			return;
		}

		// 设置 children
		Map<Integer, List<Comment>> childrenMap = childrenList.stream()
				.collect(Collectors.groupingBy(Comment::getReplyId));
		for (CommentVO vo : records) {
			List<Comment> children = childrenMap.get(vo.getId());
			if (CollectionUtils.isEmpty(children)) {
				continue;
			}
			vo.setChildren(children);
		}

	}

}
