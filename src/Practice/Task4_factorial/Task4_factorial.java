package Practice.Task4_factorial;

//Task: Write a function to calculate the factorial of a number.
public class Task4_factorial {

  public static void main(String[] args) {
    System.out.println(factorial(3));
    System.out.println(factorialRecurtion(3));
  }

  public static long factorial(int number) {
    checkNegativeValue(number);

    int left = 1;
    long result = 1;

    while (left <= number) {
      result = result * left;
      left++;
    }

    return result;
  }

  public static long factorialRecurtion(int number) {
    checkNegativeValue(number);

    if (number < 1) {
      return 1;
    }
    return number * factorialRecurtion(number-1);
  }

  private static void checkNegativeValue(int number){
    if (number < 0) {
      throw new IllegalArgumentException("App do not support calculation of negative factorial");
    }
  }
}
