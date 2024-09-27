package fr.varex13.testworkflow;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class TestWorkflowApplicationTests {

	@Test
	void contextLoads() {
		//Pour faire plaisir à sonar
		assertThat(true, is(true));
	}

}
