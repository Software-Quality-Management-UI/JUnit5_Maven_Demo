package is.hi.cs.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class MoneyWithFixtureTest {
  private Money m12;
  private Money m14;

  @BeforeEach
  void constructMoneyTestObjects() {
    m12 = new Money(12);
    m14 = new Money(14);
  }

  @Test
  public void testEquals() {
    Money equalMoney = new Money(12);
    assertTrue(m12.equals(m12));
    assertTrue(m12.equals(equalMoney));
    assertFalse(m12.equals(m14));
  }

  @Test
  public void testAdd() {
    Money expected = new Money(26);
    assertEquals(expected, m12.add(m14));
  }
}
