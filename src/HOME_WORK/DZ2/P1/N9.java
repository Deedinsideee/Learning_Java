package HOME_WORK.DZ2.P1;

import java.util.Scanner;

public class N9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] s = new String[N];
        for (int i = 0; i < s.length; i++)
        {
         s[i]=scanner.next();
        }
        Boolean flag= true;
        for (int i = 0; i < s.length; i++)
        {
            for (int j = i+1; j <s.length; j++)
            {
                if (s[i].equals(s[j]))
                {
                    flag=false;
                    System.out.println(s[i]);
                    break;
                }

            }
            if (flag==false)
            {
                break;
            }
        }
    }
}
