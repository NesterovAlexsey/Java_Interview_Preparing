package HardSkillTest1_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

  final private String content;

  public Text(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public List<String> getPartOfTextFromKeyWord(String keyWorld) {
    List<String> result = new ArrayList<>();

    HashMap<Integer, String> sections = getMapFromText();

    for (Integer key : sections.keySet()) {
      String sectionText = sections.get(key);
      if (sectionText.contains(keyWorld)) {
        result.add(sections.get(key));
      }
    }

    return result;
  }

  private HashMap<Integer, String> getMapFromText() {
    HashMap<Integer, String> sections = new HashMap<>();

    Pattern pattern = Pattern.compile("([^\\[]+\\[\\d+\\])");
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      String section = matcher.group(1);
      int number = Integer.parseInt(section.replaceAll("[^\\d]", ""));
      String text = section.replaceAll("\\[\\d+\\]", "").trim();
      sections.put(number, text);
    }

    return sections;
  }
}
