package HOME_WORK.DZ1.P3;

import java.util.Scanner;

public class N7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char s1[] =s.toCharArray();
        int count=0;
        for ( int i =0;i<s1.length;i++)
        {
            if (s1[i]==' ')
            {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
