package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Character Counting: Write a program to count the number of characters in a string excluding spaces.
public class Task2 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please, enter the text");
    String textFromUser = reader.readLine();
    
    char[] charList = textFromUser.toCharArray();
    int result = 0;

    for (char c : charList) {
      if (c != ' ') {
        result++;
      }
    }

    System.out.println(result);
  }
}
