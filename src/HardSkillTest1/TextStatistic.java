package HardSkillTest1;

//Task - Work with text:
//Create an application that analyzes the text of a story and displays statistics
//such as the total number of words, sentences, and unique words.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextStatistic {

  final static String filePath = "src/HardSkillTest1/Old Surehand I - Karl May.txt";
  public static void main(String[] args) {

    List<String> story = getText();
    System.out.println(getNumberOfWords(story));

  }

  private static List<String> getText() {
    List<String> story = new ArrayList<>();

    try {
      BufferedReader reader = new BufferedReader(new FileReader(filePath));
      String line;
      while ((line = reader.readLine()) != null) {
        story.add(line);
      }

      reader.close();
    } catch (IOException exception){
      exception.printStackTrace();
    }
    return story;
  }

  private static int getNumberOfWords(List<String> story) {
    int result = 0;

    for (String line : story) {
      String[] words = line.split("\\s+");
      result = result + words.length;
    }

    return result;
  }
}
