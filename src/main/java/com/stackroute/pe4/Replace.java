//In string daily try replace d with f and l with t

package com.stackroute.pe4;

public class Replace {
    public static void main(String[] args) {
        Replace re = new Replace();
        replaceCharacter();

    }

    public static void replaceCharacter() {
        String str = "Daily try";
//replace the character using replace All
        String str1 = str.replaceAll("D", "f");
        String str2 = str1.replaceAll("l", "t");
        System.out.println("original string is " + str2);
    }
}
