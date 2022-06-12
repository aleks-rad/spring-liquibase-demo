package ru.axl.springliquibasedemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.axl.springliquibasedemo.controller.TestController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringLiquibaseDemoApplicationTests {

	@Autowired
	private TestController testController;

	@Test
	void contextLoads() {
		assertThat(testController).isNotNull();
	}

}
