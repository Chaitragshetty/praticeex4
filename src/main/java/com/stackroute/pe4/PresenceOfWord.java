//5. Write a program with the implementation of Regular Expression to find the presence of the name
//Harry in a string.
package com.stackroute;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfWord {

/*Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.*/


    /*Write a program with the implementation of Regular Expression to find the presence of the name
 Harry in a string.*/
    public static void main(String[] args) {
        PresenceOfWord obj = new PresenceOfWord();
        Scanner scn = new Scanner(System.in);
        obj.presentword("httry", "harry");
    }

    public String presentword(String str, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
            System.out.println("Is " + word + " here? true");
        else
            System.out.println("Is " + word + " here? false");
        return null;
    }

}
