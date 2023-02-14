

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kekwwkek"));


    }










    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) // простой случай
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        else
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    }
