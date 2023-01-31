package weekn;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [][] mass = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mass[i][j]=scanner.nextInt();
            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mass[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j)
                {
                    mass[i][j]=0;
                }
                else
                {
                    mass [j][i]=mass[i][j];
                }


            }
        }



        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mass[i][j]+ " ");
            }
            System.out.println();
        }

    }
}




