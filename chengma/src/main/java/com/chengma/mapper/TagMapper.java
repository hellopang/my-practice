package com.chengma.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chengma.core.entity.Tag;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @author psh 2023/4/13 14:04
 */
public interface TagMapper extends BaseMapper<Tag> {

	/**
	 * 获取Map结构数据
	 * @return Map<Id, Tag>
	 */
	@MapKey("id")
	@Select("select * from tb_tag")
	Map<Integer, Tag> selectMap();

}
