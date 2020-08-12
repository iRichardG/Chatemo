package com.chatemo.spring.chatservices;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.chatemo.spring.chatservices.controller.MessageController;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ControllerTest {

	@Autowired
	private MessageController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
		
		
		
	}
}