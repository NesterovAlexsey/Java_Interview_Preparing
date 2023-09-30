package Practice.Task6_Stack;

//Task: Implement a stack using an array.

/*
Theory: stack principe - LIFO - "last in - first out" (Pringles)
Important stack operations:
  Push() - inserting an element in a stack
  Pop() - deleting an element from the stack
  Peek() - return the top element of a stack without removing it
  size - return the size of the stack
  isFull() - check if a stack is full
  isEmpty() - check stack is empty or not
  empty - empties the stack
  compress - no empty cells in the array
  capacityRemaining - how many free cells still empty
*/

public class StackWithArrayList {
  private int[] stack;

  private int size;

  private final static int INITIAL_SIZE = 10;

  /**
   * Constructor - create a new object of StackWithArrayList, where size = constant INITIAL_SIZE
   */
  public StackWithArrayList() {
    stack = new int[INITIAL_SIZE];
    size = 0;
  }

  /**
   * push - inserting an element in a stack on top
   * @param number - this value will be storage in stack
   */
  public void push(int number) {
    if (stack.length == size) {
      //todo - do the stack bigger
    }
    stack[size] = number;
    size++;
  }

  public static void main(String[] args) {
    StackWithArrayList stack = new StackWithArrayList();
    stack.push(1);
    stack.push(2);

    System.out.println(stack.size);
  }
}
