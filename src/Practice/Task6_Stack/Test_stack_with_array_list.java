package Practice.Task6_Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_stack_with_array_list {

  @Test
  public void stackAddDataPositiveTestForStackSize() {
    StackWithArrayList stack = new StackWithArrayList();
    stack.push(1);

    assertEquals(1, stack.getSize());
  }

  @Test
  public void stackAddElementPositiveTestForNumber(){
    StackWithArrayList stack = new StackWithArrayList();
    stack.push(1);
    int[] expectedStack = {1};

    assertArrayEquals(expectedStack, stack.toArray());
  }
}
