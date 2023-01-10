package HOME_WORK.DZ1.P3;

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c8,c4,c2,c1;
        int n = scanner.nextInt();
        for (int i=8;i>=1;i=i/2)
        {
            System.out.print(n/i);
            n=n%i;
            System.out.print(" ");

        }
    }
}
