package HOME_WORK.DZ1.P1;

import java.util.Scanner;

public class N7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int start = n/10;
        int end =n%10;
        System.out.println(end+""+start);
    }
}
