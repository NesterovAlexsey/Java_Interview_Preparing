package Practice.Task4_factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task4_factorial_test {

  @Test
  public void positiveTestFactorial(){
    long result = Task4_factorial.factorial(4);
    assertEquals(24, result);
  }

  @Test
  public void negativeValuesNegativeTest(){
      assertThrows(IllegalArgumentException.class, () -> {
        Task4_factorial.factorial(-5);
      });
  }

  @Test
  public void zeroPossitiveTest(){
    long result = Task4_factorial.factorial(0);
    assertEquals(1, result);
  }
}
