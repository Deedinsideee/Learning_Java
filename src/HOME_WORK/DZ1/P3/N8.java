package HOME_WORK.DZ1.P3;

import java.util.Scanner;

public class N8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int summ=0;
        int a;
        for (int i=0;i<n;i++)
        {
            a=scanner.nextInt();
            if (a>p)
            {
                summ+=a;
            }
        }
        System.out.println(summ);
    }
}

