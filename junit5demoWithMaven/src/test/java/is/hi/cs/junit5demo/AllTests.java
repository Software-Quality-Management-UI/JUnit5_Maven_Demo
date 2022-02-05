package is.hi.cs.junit5demo;

import org.junit.platform.suite.api.*;

@Suite
@SelectClasses({ MoneyTest.class, MoneyTestWithFixture.class, MoneyTestWithAssertThat.class, DivisionByZeroTest.class })
public class AllTests {
	// the class remains completely empty,
	// being used only as a holder for the above annotations
}
