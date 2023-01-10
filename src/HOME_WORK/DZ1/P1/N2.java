package HOME_WORK.DZ1.P1;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.sqrt((1.0/2.0)*(Math.pow((double)a,2)+Math.pow((double)b,2))));
    }
}
