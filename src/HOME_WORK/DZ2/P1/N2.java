package HOME_WORK.DZ2.P1;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=0;
        N=scanner.nextInt();
        int[] mas1 =new int[N];
        for (int i = 0;i<N;i++)
        {
             mas1[i]=scanner.nextInt();
        }
        int M=0;
        M=scanner.nextInt();
        int[] mas2 =new int[N];
        for (int i = 0;i<M;i++)
        {
            mas2[i]=scanner.nextInt();
        }
        Boolean kek = true;
        if (N==M)
        {

            for (int i = 0;i<N;i++)
            {
                if(mas1[i]!=mas2[i])
                {
                    kek=false;
                    break;
                }
            }

        }
        else
        {
            kek=false;
        }
        System.out.println(kek);
    }
}
