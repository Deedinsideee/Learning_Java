package HOME_WORK.DZ1.P2;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int D = b*b-4*a*c;
        if (D>=0)
            System.out.println("est");
        else
            System.out.println("net");
    }
}
