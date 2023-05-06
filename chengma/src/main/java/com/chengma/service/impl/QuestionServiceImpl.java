package com.chengma.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chengma.converter.QuestionConverter;
import com.chengma.core.entity.Question;
import com.chengma.core.entity.Tag;
import com.chengma.mapper.QuestionMapper;
import com.chengma.core.qo.QuestionQO;
import com.chengma.service.QuestionService;
import com.chengma.service.TagService;
import com.chengma.core.vo.QuestionVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author psh 2023/4/13 10:15
 */
@Service
@RequiredArgsConstructor
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
		implements QuestionService {

	public static final QuestionConverter CONVERTER = QuestionConverter.INSTANCE;

	private final TagService tagService;

	@Override
	public IPage<QuestionVO> page(Page<Question> pageParam, QuestionQO qo) {

		IPage<QuestionVO> pageVO = baseMapper
				.page(pageParam, baseMapper.buildWrapperByQO(qo))
				.convert(CONVERTER::poToVo);

		this.setPageTag(pageVO);
		return pageVO;
	}

	/**
	 * 设置问题分页数据的 tag 信息
	 */
	private void setPageTag(IPage<QuestionVO> pageVO) {
		// tag 信息
		Map<Integer, Tag> tagMap = tagService.getMap();

		// 问题分页数据
		List<QuestionVO> records = pageVO.getRecords();

		for (QuestionVO vo : records) {
			List<String> tagList = new ArrayList<>(4);

			String[] tagString = vo.getTags().split(",");
			for (String tag : tagString) {
				// 从tagMap获取 label
				Integer iTag = Integer.valueOf(tag);
				if (tagMap.containsKey(iTag)) {
					tagList.add(tagMap.get(iTag).getLabel());
				}
			}

			vo.setTagList(tagList);
		}

	}

}
