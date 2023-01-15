package HOME_WORK.DZ2.P1;


import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] mass = new int[N];
        for (int i = 0;i<N;i++)
        {
            mass[i]=scanner.nextInt();
        }
        int x=scanner.nextInt();
        int ind=0;
        for (int i =0; i<mass.length-1;i++)
        {
            if (mass[i]==x)
            {
                for (int j=i+1;j< mass.length;j++)
                {
                    if (mass[j]==mass[i])
                        continue;
                    else
                    {
                        ind=j;
                        break;
                    }
                }

             break;
            }
            if (x>mass[i] && x<mass[i+1])
            {
                ind=i+1;
                break;
            }
        }
        System.out.println(ind);

    }
}
