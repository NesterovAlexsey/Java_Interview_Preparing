package Practice.Task6_Stack;

//Task: Implement a stack using an array.

/*
Theory: stack principe - LIFO - "last in - first out" (Pringles)
Important stack operations:
  + Push() - inserting an element in a stack
  + Del() - deleting an element from the stack and return this element
  + Peek() - return the top element of a stack without removing it
  + size - return the size of the stack
  isFull() - check if a stack is full
  isEmpty() - check stack is empty or not
  empty - empties the stack
  + compress - no empty cells in the array
  + capacityRemaining - how many free cells still empty
*/

import java.util.ArrayList;

public class StackWithArrayList {
  private int[] stack;

  private int size;

  private final static int INITIAL_SIZE = 1;

  /**
   * Constructor - create a new object of StackWithArrayList, where size = constant INITIAL_SIZE
   */
  public StackWithArrayList() {
    stack = new int[INITIAL_SIZE];
    size = 0;
  }

  /**
   * push - inserting an element in a stack on top
   *
   * @param number - this value will be storage in stack
   */
  public void push(int number) {
    if (stack.length == size) {
      stack = doubleStackSize(stack);
    }

    stack[size] = number;
    size++;
  }

  /**
   * method deleting an element from the stack and return this element, if element exist. If not - return
   * ArrayIndexOutOfBoundsException;
   *
   * @return deleted element
   */
  public int del() {
    if (size == 0) {
      throw new ArrayIndexOutOfBoundsException("There is no elements in the stack");
    }

    int result = stack[size - 1];

    stack[size - 1] = 0;
    size--;

    return result;
  }

  /**
   * Method for creating double stack size
   *
   * @param stack - initial stack, which is full
   * @return - new stack, with same data, as an initial stack, but in 2 times bigger
   */
  private static int[] doubleStackSize(int[] stack) {
    int[] newStack = new int[2 * stack.length];
    for (int i = 0; i < stack.length; i++) {
      newStack[i] = stack[i];
    }
    return newStack;
  }

  /**
   * Method return the top element of a stack without removing it
   * @return top element of array
   */
  public int peek() {
    if (size == 0) {
      throw new ArrayIndexOutOfBoundsException("There is no elements in the stack");
    }

    return stack[size - 1];
  }

  public int getSize(){
    return size;
  }

  public int numberOfEmptyCells() {
    return stack.length - size;
  }

  public void compressionEmptyCells(){
    int[] compressStack = new int[size];
    for (int i = 0; i < size; i++) {
      compressStack[i] = stack[i];
    }

    stack = compressStack;
  }

  @Override
  public String toString() {
    String elements = "";
    for (int i = 0; i < stack.length; i++) {
      elements = elements + "[" + stack[i] + "]";
    }
    return elements;
  }

  public int[] toArray() {
    int[] result = new int[stack.length];
    for (int i = 0; i < stack.length; i++) {
      result[i] = stack[i];
    }
    return result;
  }

  public static void main(String[] args) {
    StackWithArrayList stack = new StackWithArrayList();
    stack.push(7);
    stack.push(2);
    stack.push(9);
    stack.push(4);
    stack.push(5);
    System.out.println(stack.del());
    System.out.println(stack.del());
    System.out.println(stack.peek());
    System.out.println("Stack size:" + stack.getSize());
    System.out.println("Number of empty cells:" + stack.numberOfEmptyCells());
    System.out.println(stack);

    stack.compressionEmptyCells();
    System.out.println(stack);
  }
}
