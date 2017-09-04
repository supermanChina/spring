package com.spring.boot.web.app;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.spring.boot.web.app.controller.RestServiceController;
import com.spring.boot.web.app.domain.User;

/**
 * 
 * @author Zhang Xiaochao
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWebAppApplicationTests {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new RestServiceController()).build();
	}

	@Test
	public void httpGetTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/services/get").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(equalTo("RESTful service response for GET")));
	}

	@Test
	public void restServicePostTest() throws Exception {
		// Manual convert the user object into JSON string by Jackson or other JSON tool
		User user = new User();
		user.setId(1L);
		user.setAge(20);
		user.setName("userName");
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectWriter jsonWriter = objectMapper.writer().withDefaultPrettyPrinter();
		String jsonUser = jsonWriter.writeValueAsString(user);
		// Use contentType and content to set the user JSON data into POST body
		mvc.perform(
				MockMvcRequestBuilders.post("/services/post").contentType(MediaType.APPLICATION_JSON).content(jsonUser))
				.andDo(print()).andExpect(status().isOk()).andExpect(content().string(equalTo("OK")));
		// andDo(print()) print the request & response detail for debug
	}

}
