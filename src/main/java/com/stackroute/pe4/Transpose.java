package com.stackroute.pe4;
import java.util.Scanner;
import java.lang.String;
public class Transpose {
    public static void main(String args[])
    {
    Transpose object=new Transpose();
    object.split();
    }
    public static void split()
    {

        System.out.println("enter the string");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
         String str1[]= str.split(" ");
         String rev="";
         for(int i=0;i<str1.length;i++) {
             String word = str1[i];
             String revword = "";

             for (int j = word.length()-1; j >=0; j--) {
                 revword = revword + word.charAt(j);

             }
             rev = rev + revword+" ";
         }
         System.out.println(str);
         System.out.println(rev);
    }
}
