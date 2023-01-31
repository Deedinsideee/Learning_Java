package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(summ(n));

    }










    public static int summ(int n)
    {
        if (n/10==0)
        {
            return n;
        }
        else
            return (summ(n/10)+n%10);

    }
}
