import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void test1() {
    assertFalse(c.compute(0));
  }

  @Test
  public void test2() {
    assertFalse(c.compute(1, 2));
  }


  @Test
  public void test4() {
    assertFalse(c.compute(1, 2, 3, 4));
  }



@Test
public void testWithMultipleNonZeroArguments() {
    // Assuming compute returns true if all values are non-zero
    assertTrue(c.compute(1, 3, 5));
}



@Test
public void testWithNoArguments() {
    // The behavior with no arguments needs to be defined for Util's compute method
    assertFalse(c.compute());
    // or
    // assertTrue(c.compute());
}

  @Test
  public void testWithZeroArgument() {
    try {
      c.compute(0, 1, 2);
      fail();
    } catch (RuntimeException e) {
      // Exception is expected
      assertTrue(true);
    }
  }

  @Test
  public void testWithNonDivisor() {
    assertFalse(c.compute(5,4,8));
  }


}