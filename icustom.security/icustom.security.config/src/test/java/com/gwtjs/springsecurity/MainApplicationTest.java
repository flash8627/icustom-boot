package com.gwtjs.springsecurity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SecurityMainApplication.class)
@WebAppConfiguration
public class MainApplicationTest {
	
	MockMvc mvc;

	@Autowired
	WebApplicationContext webApplicationConnect;

	@Before
	public void setUp() throws JsonProcessingException {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
	}
	
	@Test
	public void contextLoads() {
	}
	
}
