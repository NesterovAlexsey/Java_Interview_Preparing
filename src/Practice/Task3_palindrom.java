package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_palindrom {
  public static void main(String[] args) throws IOException {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please, enter the phrase:");
    String palindromChecking = read.readLine();

    System.out.println(isPalindrome(palindromChecking));
    System.out.println(isPalindrome_StringBuilder(palindromChecking));
  }

  public static boolean isPalindrome(String str) {
    String checkStr = str.toLowerCase();
    int left = 0;
    int right = checkStr.length() - 1;

    while (left < right) {
      if (checkStr.charAt(left) != checkStr.charAt(right)) {
        return false;
      }

      left++;
      right--;
    }
    return true;
  }

  public static boolean isPalindrome_StringBuilder(String str) {
    String checkString = str.toLowerCase();
    String reverseString = new StringBuilder(checkString).reverse().toString();
    return checkString.equals(reverseString);
  }
}
