package com.jdwa;

import com.jdwa.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
