package test1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Test1Test {
	@Test
	public void Test1Test() {

      String str = "World";
 
      assertEquals(str, "World");
	}
}