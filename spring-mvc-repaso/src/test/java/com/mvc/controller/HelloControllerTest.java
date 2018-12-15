package com.mvc.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;

import com.mvc.dto.UserInputDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
public class HelloControllerTest {

	private MockMvc mockMvc;

	@Autowired
	HelloController cut;

	@Test
	public void shouldBeAbleToInstantiate() {
		Assert.notNull(cut);
	}

	@Test
	public void shouldBeAbleToAnswerCorrectly() throws Exception {
		MockMvc context = MockMvcBuilders.standaloneSetup(cut).build();

		

		UserInputDto tc = new UserInputDto();
		tc.setName("Jose");
		tc.setCountry("Francia");
		tc.setCity("Paris");
		tc.setDepartament("ARQ");
		
		

		// context.perform(MockMvcRequestBuilders.post("/PaisForm", tc));
		context.perform(MockMvcRequestBuilders.post("/PaisForm", tc));
	}

	// public void showAddTodoForm() throws Exception {
	// mockMvc.perform(get("/todo/add"))
	// .andExpect(status().isOk())
	// .andExpect(view().name("todo/add"))
	// .andExpect(forwardedUrl("/WEB-INF/jsp/todo/add.jsp"))
	// .andExpect(model().attribute("todo", hasProperty("id", nullValue())))
	// .andExpect(model().attribute("todo", hasProperty("description",
	// isEmptyOrNullString())))
	// .andExpect(model().attribute("todo", hasProperty("title",
	// isEmptyOrNullString())));
	// }
	// }
	//
	//
	//

}
