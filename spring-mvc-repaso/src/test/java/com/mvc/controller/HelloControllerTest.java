package com.mvc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;

import com.mvc.dto.UserInputDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-context.xml"})
public class HelloControllerTest {

	
	@Autowired
	HelloController cut;
	
	@Test
	public void shouldBeAbleToInstantiate(){
		Assert.notNull(cut);
	}
	
	@Test
	public void shouldBeAbleToAnswerCorrectly() throws Exception{
		MockMvc context = MockMvcBuilders.standaloneSetup(cut).build();
		
		UserInputDto tc = new UserInputDto();
		tc.setCity("bla");
		
		context.perform(MockMvcRequestBuilders.post("/PaisForm", tc));
	}
}
