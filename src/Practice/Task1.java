package Practice;
//FizzBuzz: Write a program that prints numbers from 1 to 100, but prints "Fizz" for numbers that are multiples of 3,
// "Buzz" for numbers that are multiples of 5, and "FizzBuzz" for numbers that are multiples of both 3 and 5.

import java.util.List;

public class Task1 {
  public static void main(String[] args) {
    Integer num;
    for (num = 1; num <= 100; num++) {
      if (num % 15 == 0) {
        System.out.println("FizzBuzz");
      } else if (num % 5 == 0) {
        System.out.println("Buzz");
      } else if (num % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(num);
      }
    }
  }
}
