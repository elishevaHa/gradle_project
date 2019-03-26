package com.microfocus.firstPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Test1 {

	@Test
	void foo1() {
		int a=2;
		assertEquals(2,a );
	}
	@Test
	void foo2() {
		int a=1;
		assertEquals(1,a );
	}
	@Test
	void foo3() {
		int a=3;
		assertEquals(3,a );
	}

}
