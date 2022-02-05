package is.hi.cs.junit5demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionByZeroTest {

	@Test
	public void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			int b = 2 / 0;
		});
	}
}