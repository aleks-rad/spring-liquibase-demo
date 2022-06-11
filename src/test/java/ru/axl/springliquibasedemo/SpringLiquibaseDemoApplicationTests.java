package ru.axl.springliquibasedemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.axl.springliquibasedemo.controller.MainController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringLiquibaseDemoApplicationTests {

	@Autowired
	private MainController mainController;

	@Test
	void contextLoads() {
		assertThat(mainController).isNotNull();
	}

}
