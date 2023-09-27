package Practice.Task5_reverseString;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static Practice.Task5_reverseString.Task5_reverseString.*;

public class Test5_reverseString_tests {

  @Test
  public void positiveTest() {
    String result1 = reverseStringWithLibrary("12345");
    String result2 = reverseString("12345");
    String result3 = reverseStringWithCharArray("12345");

    assertEquals("54321", result1);
    assertEquals("54321", result2);
    assertEquals("54321", result3);
  }

  @Test
  public void testOfEmptyValue() {
    String result1 = reverseStringWithLibrary("");
    String result2 = reverseString("");
    String result3 = reverseStringWithCharArray("");

    assertEquals("", result1);
    assertEquals("", result2);
    assertEquals("", result3);
  }

  @Test
  public void testOfNullValue() {
    assertThrows(NullPointerException.class, () -> {reverseString(null); });
  }
}
