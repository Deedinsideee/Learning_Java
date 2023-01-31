package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }
        int x = 0;//столбец
        int y = 0; // строка
        int p = scanner.nextInt();
        int[][] newmass = new int[n - 1][n - 1];

        kekw:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mass[i][j] == p) {
                    x = j;
                    y = i;
                    break kekw;
                }
            }
        }
        try {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    newmass[i][j] = mass[i][j];
                }
            }
        } catch (Exception e) {
        }
        try {
            for (int i = 0; i < y; i++) {
                for (int j = x + 1; j < n; j++) {
                    newmass[i][j-1] = mass[i][j];
                }
            }
        } catch (Exception e) {
        }
        try {
            for (int i = y + 1; i < n; i++) {
                for (int j = 0; j < x; j++) {
                    newmass[i-1][j] = mass[i][j];
                }
            }
        } catch (Exception e) {
        }
        try {
            for (int i = y + 1; i < n; i++) {
                for (int j = x + 1; j < n; j++) {
                    newmass[i-1][j-1] = mass[i][j];
                }
            }
        } catch (Exception e) {
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {

                if (j == newmass.length - 1) {
                    System.out.print(newmass[i][j] );
                } else
                    System.out.print(newmass[i][j] + " ");


            }
            if (i == newmass.length - 1) {

            } else
                System.out.println();
        }


    }
}
