package HOME_WORK.DZ2.P1.DOP;

import java.util.Scanner;

public class N1 {

    public static String genPass(int len)
    {
        char[][] matrix = new char[4][];
        matrix[0]  = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        matrix[1]  = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        matrix[2]  = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        matrix[3]  = new char[]{'!', '@', '#', '$', '%', '&', '?', '-', '+', '=', '~'};
        char[] allsymb = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','1', '2', '3', '4', '5', '6', '7', '8', '9', '0','!', '@', '#', '$', '%', '&', '?', '-', '+', '=', '~'};
        char[] pasww = new char[len];
        int kech,pos ;

        int schet=0;
        while (schet<4) {
            pos=(int)(Math.random()*(len-1));
            if (pasww[pos]=='\0')
            {   kech=(int)(Math.random()*(matrix[schet].length-1));
                pasww[pos]=matrix[schet][kech];
                schet++;
            }
            else
                continue;

        }


        for (int i = 0 ; i<len;i++)
        {
            if (pasww[i]=='\0')
            {
                pasww[i]=allsymb[(int)(Math.random()*(allsymb.length-1))];
            }
            else
                continue;

        }

        String str = new String(pasww);
        return str;
    }










    public static void main(String[] args) {
        System.out.println("Vvedite dlinu");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (N <8)
        {
            System.out.println("Parol s "+ N +" symvolami nebezopasen");
            N = scanner.nextInt();
        }
        System.out.println(genPass(N));
        //ы
    }
}
