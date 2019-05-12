//Write a program that sets up a String variable containing a paragraph of text of your choice.
//a. Extract the words from the text and sort them into alphabetical order.
//b. Display the sorted list of words.


package com.stackroute.pe4;

import java.util.Scanner;

public class ExtractWord {
    public static void main(String[] args) {
        //creation object
        ExtractWord obj = new ExtractWord();
        obj.paragraph();

    }

    public void paragraph() {
        int i;
        System.out.println("enter the input");
        Scanner scan = new Scanner(System.in);
        String para = scan.nextLine();
        //splitting given input storing in array para1
        String[] para1 = para.split(" ");
        for (i = 0; i < para1.length; i++) {
            for (int j = i + 1; j < para1.length; j++) {
                //soting given input
                if (para1[i].compareTo(para1[j]) > 0) {
                    String temp = para1[i];
                    para1[i] = para1[j];
                    para1[j] = temp;
                }
            }
        }
        for (i = 0; i < para1.length; i++) {
            System.out.println("sorted list is  " + para1[i]);
        }
    }


}
