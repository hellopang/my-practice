package com.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengma.core.entity.Tag;

import java.util.Map;

/**
 * @author psh 2023/4/13 14:04
 */
public interface TagService extends IService<Tag> {

	/**
	 * 获取Map结构数据，后边可以放缓存, 或者前端使用字典, 后端不必回显
	 * @return Map<Id, Tag>
	 */
	Map<Integer, Tag> getMap();

}
