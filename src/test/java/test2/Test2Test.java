package test2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Test2Test {
	@Test
	public void Test2Test() {

      String str = "World";
 
      assertEquals(str, "World");
	}
}

