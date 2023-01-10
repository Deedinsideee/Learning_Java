package HOME_WORK.DZ1.P2;

import java.util.Scanner;

public class N11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(  a+b>c && b+c>a && c+a>b  );


    }
}
