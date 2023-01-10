package HOME_WORK.DZ1.P2;

import java.util.Scanner;

public class N7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0,s.indexOf(' '))+"\n"+ s.substring(s.indexOf(' ')+1));
    }
}
