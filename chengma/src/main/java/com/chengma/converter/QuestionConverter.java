package com.chengma.converter;

import com.chengma.core.entity.Question;
import com.chengma.core.vo.QuestionVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author psh 2023/4/13 15:01
 */
@Mapper
public interface QuestionConverter {

	QuestionConverter INSTANCE = Mappers.getMapper(QuestionConverter.class);

	/**
	 * po to vo
	 * @param po po
	 * @return QuestionVO
	 */
	QuestionVO poToVo(Question po);

}
