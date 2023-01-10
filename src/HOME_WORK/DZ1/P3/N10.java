package HOME_WORK.DZ1.P3;

import java.util.Scanner;

public class N10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int countfinal= n*2-1;
        for (int i=0;i<countfinal/2;i++)
        {
            System.out.print(" ");
        }
        System.out.print("#\n");


        for (int i =1;i<n;i++)
            {    int cn=i*2+1;
                for (int j=0;j<(countfinal-cn)/2;j++)
                {
                    System.out.print(" ");
                }
                for (int j=0;j<cn;j++)
                {
                    System.out.print("#");
                }
                System.out.print("\n");
            }

        for (int i=0;i<countfinal/2;i++)
        {
            System.out.print(" ");
        }
        System.out.print("|");
    }
}
