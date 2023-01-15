package HOME_WORK.DZ2.P1;

import java.util.Arrays;
import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int mass[]=new int[N];
        int mass1[]=new int[N];

        for (int i = 0; i<N;i++)
        {
            mass[i]=scanner.nextInt();
        }
        int M=scanner.nextInt();
        int ind=0;
        for (int i = 0;i<N;i++)
        {
            ind =i+M;
            if(ind >=N )
            {
                ind = i+M-N;
            }
            mass1[ind]=mass[i];

        }
        System.out.print(Arrays.toString(mass1));

    }
}
