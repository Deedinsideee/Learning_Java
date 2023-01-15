package HOME_WORK.DZ2.P1;

import java.util.Scanner;

public class N8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] mass = new int[N];
        for (int i = 0; i < mass.length ; i++) {
            mass[i]=scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] minimums = new int[2];
        int min= 1000;
        for (int i = 1; i <= mass.length; i++) {
            if (Math.abs(mass[i-1]-M) <=Math.abs(min-M))
            {
                min=mass[i-1];
                minimums[i%2]=mass[i-1];
            }
        }
        int max=minimums[0];
        for (int i = 0; i < minimums.length; i++) {
            if (max<minimums[i])
            {
                max=minimums[i];
            }
        }
        System.out.println(max);



    }
}
