package com.chengma.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chengma.core.entity.Tag;
import com.chengma.mapper.TagMapper;
import com.chengma.service.TagService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author psh 2023/4/13 14:05
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

	@Override
	public Map<Integer, Tag> getMap() {
		return baseMapper.selectMap();
	}

}
