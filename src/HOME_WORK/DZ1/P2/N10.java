package HOME_WORK.DZ1.P2;

import java.util.Scanner;

public class N10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        System.out.println((int) Math.log(Math.pow(Math.E, n)) == (int) n);


    }
}
