package week1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a, b, c, buff;
        a = console.nextInt();
        b = console.nextInt();
        c = console.nextInt();
        System.out.println("A=" + a + " " + "B=" + b + " " + "C=" + c);
        buff = a;
        a = b;
        b = buff;
        System.out.println("A=" + a + " " + "B=" + b + " " + "C=" + c);
        buff = b;
        b = c;
        c = buff;
        System.out.println("A=" + a + " " + "B=" + b + " " + "C=" + c);
        buff = c;
        c = a;
        a = buff;
        System.out.println("A=" + a + " " + "B=" + b + " " + "C=" + c);


    }
}
