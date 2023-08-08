package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 The first word within the output should be capitalized only if the original word was capitalized
 (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

public class Task1 {
    public static void main(String[] args) {
        String s = "the-stealth-warrior";
        String s2 = "The_Stealth_Warrior";
        String s3 = "The_Stealth-Warrior";

        System.out.println(toCamelCase(s));
        System.out.println(toCamelCase(s2));
        System.out.println(toCamelCase(s3));

    }

    static String toCamelCase(String s) {
        String[] words = s.split("-");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                char[] bigLetter = words[i].toCharArray();
            }
            result = result + words[i];
        }
        return result;
    }
}
