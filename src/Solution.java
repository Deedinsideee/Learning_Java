

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        System.out.print("A,B;C".replaceAll(",;", "#") + " ");
        System.out.println("A,B;C".replaceAll("[,;]", "#"));

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
