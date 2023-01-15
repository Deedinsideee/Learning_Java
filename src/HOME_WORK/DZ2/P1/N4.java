package HOME_WORK.DZ2.P1;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int[] mass = new int[N];
        for (int i = 0 ; i<N;i++)
        {
            mass[i]=scanner.nextInt();
        }
        int count;
        int i=0;
        while (i < N)
        {
            count=1;
            for (int j=i+1;j<N;j++)
            {
                if (mass[i]==mass[j])
                {
                    count++;
                }
                else
                {
                    break;
                }


            }
            System.out.println(count + " "+ mass[i] + "\n");
            i+=count;

        }







    }
}
