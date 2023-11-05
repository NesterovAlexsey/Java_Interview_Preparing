package HardSkillTest1_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FindWord {

  final static String pathToFairyTale = "src/HardSkillTest1_2/Das Märchen - Goethe .txt";

  public static void main(String[] args) {

    Text DasMarchen = new Text(readTextFromFile(pathToFairyTale));
    List<String> partsContainKeyWord = DasMarchen.getPartOfTextFromKeyWord("Flusse");
    for (String part : partsContainKeyWord) {
      System.out.println(part);
      System.out.println("========================================================");
    }

  }

  private static String readTextFromFile(String path) {
    String result;
    StringBuilder sb = new StringBuilder();

    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String line;
      while ((line = reader.readLine()) != null) {
        sb.append(line).append("\n");
      }
      reader.close();
      result = sb.toString();

    } catch (IOException e) {
      e.printStackTrace();
      result = "";
    }

    return result;
  }
}
