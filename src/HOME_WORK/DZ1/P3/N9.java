package HOME_WORK.DZ1.P3;

import java.util.Scanner;

public class N9 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);



        int count=0;
        int a;

        while (true)
        {
            a=scanner.nextInt();
            if (a<0)
            {
                count++;
            }
            else {break;}

        }
        System.out.println(count);
    }
}
