package com.example.demo;

import com.example.demo.model.dao.BlogMapper;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private final static Logger LOG = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Autowired
	BlogMapper blogMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testBlog() {
		Gson gson = new Gson();
		LOG.info(gson.toJson(blogMapper.selectBlogDetails(1)));
		LOG.info(gson.toJson(blogMapper.selectBlog(1)));
	}

}
