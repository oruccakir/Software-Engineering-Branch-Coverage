import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void test1() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);
    assertEquals(-1, c.countNumberOfOccurrences("a"));
  }

 
  @Test
  public void test3() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(1);
    when(mq.getAt(0)).thenReturn("b");
    assertEquals(0, c.countNumberOfOccurrences("a"));
  }
  
  @Test
public void testQueueContainsElementOnce() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(1);
    when(mq.contains("a")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("a");
    assertEquals(1, c.countNumberOfOccurrences("a"));
}

@Test
public void testQueueContainsElementMultipleTimes() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(3);
    when(mq.contains("a")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("a");
    when(mq.getAt(1)).thenReturn("b");
    when(mq.getAt(2)).thenReturn("a");
    assertEquals(2, c.countNumberOfOccurrences("a"));
}





}