package com.microfocus.firstPackage;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Test2 {
	@Test
	public void helloWorldTest() {

      String str = "World";
 
      assertEquals(str, "World");
	}
	@Test
	public void test2HelloWorldTest() {

		String str = "World";

		assertEquals(str, "World");
	}
}

