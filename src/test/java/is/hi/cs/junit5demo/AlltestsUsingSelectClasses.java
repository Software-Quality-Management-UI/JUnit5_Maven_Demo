package is.hi.cs.junit5demo;

import org.junit.platform.suite.api.*;

@Suite
@SelectClasses({ MoneyTest.class, MoneyWithFixtureTest.class, MoneyWithAssertThatTest.class, DivisionByZeroTest.class })
public class AlltestsUsingSelectClasses { // Class name uses by intention lower case "test" to avoid being included by .*Test.* pattern!
	// The class remains completely empty,
	// being used only as a holder for the above annotations
}
