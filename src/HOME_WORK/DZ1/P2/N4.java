package HOME_WORK.DZ1.P2;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==6 || n==7)
            System.out.println("Vihi");
        else
            System.out.println(6-n);
    }
}
