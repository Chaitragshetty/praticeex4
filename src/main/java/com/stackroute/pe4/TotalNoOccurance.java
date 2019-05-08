package com.stackroute.pe4;
import java.util.Scanner;
import java.lang.String;

public class TotalNoOccurance {
    public static void main(String args[])
    {
        TotalNoOccurance object=new TotalNoOccurance();
        object.countCharacter();
    }
    public static void countCharacter()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter rhe string");
        String str=scan.nextLine();
        System.out.println("enter rhe character");
        String character=scan.nextLine();
        int charcount = str.length() - str.replaceAll(character, "").length();
        System.out.println("Occurrence Of b Char In String: " + charcount);
    }
}

