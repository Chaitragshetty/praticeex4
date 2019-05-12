//Write a program to find out the multiple occurrences of the given word in a string using Matcher
//methods.
package com.stackroute.pe4;

import java.util.Scanner;

public class TotalNoOccurance {
    public static void main(String[] args) {
        TotalNoOccurance object = new TotalNoOccurance();
        countCharacter();
    }

    public static void countCharacter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter rhe string");
        String str = scan.nextLine();
        System.out.println("enter rhe character");
        String character = scan.nextLine();
        //counting number of repeated character
        int charcount = str.length() - str.replaceAll(character, "").length();
        System.out.println("Occurrence Of b Char In String: " + charcount);
    }
}

