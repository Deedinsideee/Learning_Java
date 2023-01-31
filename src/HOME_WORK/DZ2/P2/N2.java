package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j]= 0;
            }
        }
        int x1= scanner.nextInt();
        int y1 =scanner.nextInt();
        int x2= scanner.nextInt();
        int y2 =scanner.nextInt();


        for (int i = x1; i <=x2; i++) {

                mass[y1][i]=1;

        }
        for (int i = y1; i <=y2; i++) {

                mass[i][x1]=1;

        }
        for (int i = x2; i >=x1; i--) {

            mass[y2][i]=1;

        }
        for (int i = y2; i >=y1; i--) {

            mass[i][x2]=1;

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == mass.length-1)
                {
                    System.out.print(mass[i][j]+" ");
                }
                else
                    System.out.print(mass[i][j]+" ");



            }
            if (i == mass.length-1)
            {

            }
            else
                System.out.println();
        }








    }
}
