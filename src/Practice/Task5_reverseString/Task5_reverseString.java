package Practice.Task5_reverseString;

//Task: Write a program to reverse a string
public class Task5_reverseString {

  public static void main (String[] args) {
    //todo unit tests
    System.out.println(reverseStringWithLibrary("123456"));
    System.out.println(reverseStringWithCharArray("1234567"));
    System.out.println(reverseString("12345678"));
  }

  public static String reverseStringWithCharArray(String text){
    isTextNull(text);

    char[] forReverse = text.toCharArray();

    int left = 0;
    int right = forReverse.length - 1;

    while(right >= left) {

      char temp = forReverse[left];
      forReverse[left] = forReverse[right];
      forReverse[right] = temp;

      left++;
      right--;
    }
    String result = new String(forReverse);

    return result;
  }

  public static String reverseStringWithLibrary(String text) {
    isTextNull(text);
    return new StringBuilder(text).reverse().toString();
  }

  public static String reverseString(String text) {
    isTextNull(text);
    String reverse = "";

    for (int i = text.length() - 1; i >= 0; i--) {
      reverse = reverse + text.charAt(i);
    }

    return reverse;
  }

  private static void isTextNull(String text) {
    if (text == null) {
      throw new NullPointerException("Null is unavailable parameter");
    }
  }

}
