package HOME_WORK_PROF.DZ1.N5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {
            int n = inputN();
            System.out.println("uspeshniy vvod!");
        } catch (Exception e) {
            System.err.println(  e.getMessage());
        }



    }

    private static int inputN() throws Exception {
        System.out.println("Введите число n, 0 < n < 100");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 100 || n < 0) {
            throw new Exception("Neverniy vvod");
        }
        return n;
    }
}

