

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(summ(n));

    }










    public static String  summ(int n)
    {
        if (n/10==0)
        {
            return String.valueOf(n);
        }
        else
            return ( String.valueOf(n%10)+" "+summ(n/10) );

    }
}
