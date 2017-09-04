package com.spring.boot.web.app;

import static org.hamcrest.Matchers.equalTo;
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

import com.spring.boot.web.app.controller.RestServiceController;

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
	public void restServiceGetTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/services/get").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(equalTo("RESTful service response for GET")));
	}

}
