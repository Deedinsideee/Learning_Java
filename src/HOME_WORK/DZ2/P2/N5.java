package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }
        Boolean kek=true;
        keks:for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j)
                {
                    continue;
                }
                else
                {
                   if (mass[i][j]==mass[n-1-j][n-1-i])
                   {
                       continue ;
                   }
                   else
                       kek=false;
                       break keks;
                }

            }
        }
        System.out.println(kek);





    }
}

