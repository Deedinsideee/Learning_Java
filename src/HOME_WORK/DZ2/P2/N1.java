package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] mass = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j]= scanner.nextInt();
            }
        }
        int min;
        int[] mins = new int[m];
        for (int i = 0; i < m; i++) {
            min = mass [i][0];

            for (int j = 0; j < n; j++) {
                if (mass[i][j] < min)
                    min = mass[i][j];

            }
            mins[i]=min;
        }

        for (int i = 0; i <mins.length; i++) {
            if (i == mins.length-1)
            {
                System.out.print(mins[i]+" ");
            }
            else
                System.out.print(mins[i]+" ");

        }


    }
}
