//Write a java program to count the total number of occurrences of a given character in a string
import java.util.regex.Matcher;
import java.util.regex.Pattern;

package com.stackroute.pe4;

public class MultipleOccuranceOfWords {


        public static void main(String[] args) {
            //actual text
            String text = "She sells seashells by the seashore";
            //pattern to be match
            String patternString = "se";
            //matching the pattern with text
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(text);

            int count = 0;
            while (matcher.find()) {
                count++;
                System.out.println("found: " + count + " : "
                        + matcher.start() + " - " + matcher.end());
            }
        }
    }

}
