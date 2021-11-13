package com.springboot.tekton.s2i;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class SpringbootTektonS2iDemoApplicationTests {

	@Autowired                           
    private MockMvc mockMvc;
	
	String response ="Hello World";
	
	@Test
	public void testHelloReturnMessage() throws Exception {
		
		this.mockMvc.perform(get("/hello") 
                .accept(MediaType.APPLICATION_JSON)) 
                .andExpect(status().isOk()) 
                .andExpect(content().string(response));
    }

}
