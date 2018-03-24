package com.ahn.test;

import com.ahn.testExam.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTests {

	@LocalServerPort
	int port;
	@Autowired
	MockMvc mockMvc;
	@Autowired
	TestRestTemplate testRestTemplate;

	@MockBean
	TestService testService;
	@Test
	public void testFoo() {
		System.out.println("port:::"+port);
		assertThat(mockMvc).isNotNull();
		/*mockMvc.perform(get("/cors/corsTest"))
				.andExpect(status().isOk())
				.andExpect(content().equals("corsTest"));*/
	}
	@Test
	public void testFooWithWebTestClient(){
		BDDMockito.given(testService.testHello()).willReturn("mock");
	}
}
