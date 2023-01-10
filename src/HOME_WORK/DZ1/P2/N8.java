package HOME_WORK.DZ1.P2;

import java.util.Scanner;

public class N8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(s.substring(0,s.lastIndexOf(' '))+"\n"+ s.substring(s.lastIndexOf(' ')+1));
    }
}
