package Practice;

public class Task7_GPT_Palindrom {

  public static boolean checkPalindrom(String word) {

    String checkWord = word.toLowerCase();
    boolean result = false;

    String palindrom = new StringBuilder(checkWord).reverse().toString();
    if (checkWord.equals(palindrom)) {
      result = true;
    }

    return result;
  }
}
