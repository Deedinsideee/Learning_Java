package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N9 {
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
            return (summ(n/10) + " "+ String.valueOf(n%10));

    }
}
