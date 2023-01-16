package HOME_WORK.DZ2.P1;

import java.util.Scanner;

public class N10 {


    public static void Game() {
        int ran = (int) (Math.random() * 1000);
        System.out.println(ran);
        System.out.println("Ugadaite chislo!");
        Scanner scanner = new Scanner(System.in);
        int num=0 ;
        while (num>-1) {
            num = scanner.nextInt();
            if (num == ran) {
                System.out.println("True!!!");
                break;
            } else if (num > ran) {
                System.out.println("Menshe!!!");
            } else if (num < ran) {

                System.out.println("Bolshe!!!");
            }
        }


    }


    public static void main(String[] args) {
            Game();
    }


}
