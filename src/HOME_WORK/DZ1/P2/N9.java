package HOME_WORK.DZ1.P2;

import java.util.Scanner;

public class N9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println((int)(Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2) - 1) == 0);


    }
}
