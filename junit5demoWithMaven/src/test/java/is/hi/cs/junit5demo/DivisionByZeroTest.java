package is.hi.cs.junit5demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DivisionByZeroTest {

	@Test
	void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			int b = 2 / 0;
		});
	}
}