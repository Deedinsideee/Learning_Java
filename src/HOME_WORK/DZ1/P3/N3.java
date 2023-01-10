package HOME_WORK.DZ1.P3;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);

        m= scanner.nextInt();
        n=scanner.nextInt();
        int sum=0;
        for (int i =1;i<=n;i++)
        {
            sum+=Math.pow(m,i);
        }
        System.out.println(sum);
    }
}
