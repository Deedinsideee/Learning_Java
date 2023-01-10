package Proect;

import java.util.Scanner;

public class KursDollara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки
        int dollars = scanner.nextInt();
        double roubles;
        roubles = ROUBLES_PER_DOLLAR * dollars;
        System.out.println((int)(roubles*100)/100.0);
    }
}
