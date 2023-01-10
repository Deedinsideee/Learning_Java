package HOME_WORK.DZ1.P3;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m,n;
        m=scanner.nextDouble();
        n=scanner.nextDouble();
        while (m>0)
        {
            m-=n;
        }
        if (m<0)
        {
            m+=n;
        }
        System.out.println((int)m);

    }
}
