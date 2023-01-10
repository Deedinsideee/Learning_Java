package HOME_WORK.DZ1.P2;

import java.util.Scanner;

public class ND3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int summ = scanner.nextInt();

        if ((s.contains("samsung") || s.contains("iphone")) && (summ>50000 && summ<=120000))
            System.out.println("mojno");
        else
            System.out.println("nelzya");
    }
}
