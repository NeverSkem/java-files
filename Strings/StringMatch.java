package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatch {
	public static void main (String[] args) {
	int numberOfOccurence = 0;

	String textString = "You will always have my love, my love, for the love I love is as lovely as love itself.";
    String patternString = "love";
    String newText = (textString.replace("love", patternString.toUpperCase()).replace("LOVEly", "lovely"));
    Pattern findPattern = Pattern.compile("LOVE");
    Matcher countPattern = findPattern.matcher(newText);
    while (countPattern.find()) {
		numberOfOccurence++;
	}
    System.out.println("New text: " + newText);
    System.out.println("Number of occurence: " + numberOfOccurence);
	}
}