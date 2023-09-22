package Practice.Task4_factorial;

//Task: Write a function to calculate the factorial of a number.
public class Task4_factorial {

  //add tests
  public static void main(String[] args) {
    System.out.println(factorial(3));
  }

  public static long factorial(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("App do not support calculation of negative factorial");
    }

    int left = 1;
    long result = 1;

    while (left <= number) {
      result = result * left;
      left++;
    }

    return result;
  }
}
