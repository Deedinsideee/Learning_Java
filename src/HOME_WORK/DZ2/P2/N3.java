package HOME_WORK.DZ2.P2;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[][] mass = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j]= "0";
            }
        }
        int x = scanner.nextInt(); //столбец
        int y = scanner.nextInt(); // строка

        mass[y][x]= "K";
        try {
            mass[y+2][x+1]="X";

        }
        catch (Exception e)
        {

        }
        try {
            mass[y+2][x-1]="X";

        }
        catch (Exception e)
        {

        }
        try {
            mass[y+1][x+2]="X";

        }
        catch (Exception e)
        {

        }
        try {
            mass[y+1][x-2]="X";

        }
        catch (Exception e)
        {

        }
        try {
            mass[y-1][x-2]="X";

        }
        catch (Exception e)
        {

        }
        try {
            mass[y-1][x+2]="X";

        }
        catch (Exception e)
        {

        }
        try {
            mass[y-2][x-1]="X";

        }
        catch (Exception e)
        {

        }
        try {
            mass[y-2][x+1]="X";

        }
        catch (Exception e)
        {

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
