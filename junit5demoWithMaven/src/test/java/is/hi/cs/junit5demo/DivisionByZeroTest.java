package is.hi.cs.junit5demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionByZeroTest {

	@Test
	void testDivideByZero() {
		int a = 2 / 1; 
		assertThrows(ArithmeticException.class, () -> {
			int b = 2 / 0;
		});
		int c = 2 / 2;
	}
}