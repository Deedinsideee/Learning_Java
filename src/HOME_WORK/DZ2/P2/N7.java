package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] namesmass = new String[n];
        for (int i = 0; i < n; i++) {

            namesmass[i] = scanner.next();

        }
        String[] sobaksmass = new String[n];
        for (int i = 0; i < n; i++) {

            sobaksmass[i] = scanner.next();

        }

        double[][] matr = new double[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                matr[i][j] = scanner.nextDouble();
            }
        }
        double[] matrsr = new double[n];
        double ke= 0;
        for (int i = 0; i < n; i++) {
            ke=0;
            for (int j = 0; j < 3; j++) {
                ke+=matr[i][j];
            }
            ke=ke/3;
            matrsr[i]=ke;
        }

        double max=matrsr[0];
        int ind=0;
        for (int i = 0; i < 3; i++) {
            max=matrsr[0];
            ind=0;
            for (int j = 0; j < n; j++) {
                if(max<matrsr[j])
                {
                    max=matrsr[j];
                    ind=j;
                }
            }
            matrsr[ind]=0;
            String res = String.format("%.1f",max);
            System.out.println(namesmass[ind]+": " +sobaksmass[ind]+", "+ (int)(max*10)/10.0);
        }


    }
}
