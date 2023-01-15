package HOME_WORK.DZ2.P1;

import java.util.Scanner;

public class N7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int[] mass = new int[N];
        int buff;
        for (int i = 0; i<N; i++)
            {
            mass[i]=scanner.nextInt();
            }
        for (int i = 0; i< mass.length;i++)
            {
                mass[i]=mass[i]*mass[i];
            }
        for (int i = 0; i< mass.length;i++)
        {
            for (int j = mass.length-1;j>0;j--)
            {
                if(mass[j]<mass[j-1])
                {
                    buff=mass[j];
                    mass[j]=mass[j-1];
                    mass[j-1]=buff;
                }
            }
        }
        for (int i=0 ;i<mass.length;i++)
        {
            if (i== mass.length-1)
            {
                System.out.print(mass[i]);
                break;
            }
            System.out.print(mass[i]+" ");
        }




    }
}
