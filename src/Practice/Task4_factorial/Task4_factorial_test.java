package Practice.Task4_factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task4_factorial_test {

  @Test
  public void positiveTestFactorial(){
    long result = Task4_factorial.factorial(4);
    assertEquals(24, result);
  }

  //todo and tests for negative test factorial

}
