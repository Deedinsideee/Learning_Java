package week1;

import java.util.Scanner;

/*
Дано m – количество гигабайт трафика, используемое пользователем за месяц, с – заплаченная цена за этот трафик.
        Вычислить стоимость одного гигабайта трафика.

        Ограничения:
        0 < m < 100
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int c = console.nextInt();
        System.out.println((double) c/m);
    }
}
