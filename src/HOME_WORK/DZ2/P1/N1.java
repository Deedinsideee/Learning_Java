package HOME_WORK.DZ2.P1;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double mass[]=new double[n];
        double srar=0;
        for (int i = 0 ; i<mass.length;i++)
        {
            mass[i]=scanner.nextDouble();
            srar+=mass[i];
        }
        System.out.println(srar/mass.length);

    }
}
