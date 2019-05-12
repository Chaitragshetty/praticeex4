//Write a program to transpose the given string.
//Input String : a quick brown fox jumps over the lazy dog
//Output String: a kciuq nworb xof spmuj revo eht yzal god
package com.stackroute.pe4;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Transpose object = new Transpose();
        split();
    }

    public static void split() {

        System.out.println("enter the string");
        //giving input using scanner class
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //sstore it in arrayplitting given input and 
        String[] str1 = str.split(" ");
        String rev = "";
        for (int i = 0; i < str1.length; i++) {
            String word = str1[i];
            String revword = "";
            //reversing given string
            for (int j = word.length() - 1; j >= 0; j--) {
                revword = revword + word.charAt(j);

            }
            rev = rev + revword + " ";
        }
        System.out.println(str);
        System.out.println(rev);
    }
}
