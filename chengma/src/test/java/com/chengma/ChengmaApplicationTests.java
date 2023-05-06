package com.chengma;

import com.chengma.core.entity.Comment;
import com.chengma.core.entity.Tag;
import com.chengma.service.CommentService;
import com.chengma.service.TagService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class ChengmaApplicationTests {

	@Autowired
	CommentService commentService;

	@Autowired
	TagService tagService;

	@Test
	void listComment() {
		List<Comment> list = commentService.list();
		System.out.println(list);
	}

	@Test
	void tagMap() {
		Map<Integer, Tag> map = tagService.getMap();
		System.out.println(map);
	}

}
