package jrr.by.lesson2;

import java.util.Arrays;

public class Palindrome {

    Palindrome() {
    }

     boolean isPalindrome(String text){
         char[] myString = text.toCharArray();
         char[] newArray = new char[myString.length];
         for (int i = 0; i < myString.length; i++) {
             newArray[newArray.length - i - 1] = myString[i];
         }
         return Arrays.equals(newArray, myString);
    }
}
