package HOME_WORK.DZ1.P3;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);


        n=scanner.nextInt();
        String s = Integer.toString(n);
        char k[]=s.toCharArray();
        for (int i=0;i<k.length;i++)
        {
            System.out.println(k[i]);
        }


    }
}
