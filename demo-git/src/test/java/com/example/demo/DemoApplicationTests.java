package com.example.demo;


import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
	private final Adder obj = new Adder();

	@Test
	void testAddition() {
		assertEquals(5 , obj.add(2, 3));
	}
	
	@Test
	void testAdditionArrays() {
		Long arr[] = {2L,3L};
		assertEquals(5 ,  obj.add(arr) );
	}
	

}
