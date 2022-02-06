package is.hi.cs.junit5demo;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Tag("UsingHamcrest")
public class MoneyTestWithAssertThat {

	private Money m12;
	private Money m14;

	@BeforeEach
	void constructMoneyTestObjects() {
		m12 = new Money(12);
		m14 = new Money(14);
	}

	@Test
	public void testEqualsUsingFixture() {
		Money equalMoney = new Money(12);
		assertThat(m12, is(equalTo(m12)));
		assertThat(m12, is(equalTo(equalMoney)));
		assertThat(m12, is(not(equalTo(m14))));
	}

	@Test
	public void testAddUsingFixture() {
		Money expected = new Money(26);
		assertThat(m12.add(m14), is(equalTo(expected)));
	}
}
