package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] kmass=new int[2][4];
        for (int i = 0; i < 4; i++) {
            kmass[0][i]=scanner.nextInt();
        }
        int[][] mass = new int[7][4];
        for (int i = 0; i <7; i++) {
            for (int j = 0; j < 4; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }
        int summ=0;
        for (int i = 0; i <4; i++) {
            summ=0;
            for (int j = 0; j < 7; j++) {
                summ+=mass[j][i];
            }
            kmass[1][i]=summ;
        }
        boolean kekw = true;
        for (int i = 0; i < 4; i++) {
            if (kmass[1][i]>kmass[0][i])
            {kekw=false;
                break;
            }
            else
                continue;
        }

        if (kekw==false)
            System.out.println("Menshe");
        else
            System.out.println("otl");





    }
}
