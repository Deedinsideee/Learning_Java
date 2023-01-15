package HOME_WORK.DZ2.P1;

import java.util.Arrays;
import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = new char[]{'А', 'Б', 'В', 'Г', 'Д', 'Е','Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я'};
        String[] s=new String[]{".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};
        String vvod= scanner.nextLine();
        char[] vvod1 =vvod.toCharArray();
        int ind=0;
        String[] kekw = new String[vvod1.length];
        for (int i=0;i<vvod1.length;i++)
        {
            for (int j= 0; j < arr.length; j++)
            {
                if (arr[j] == vvod1[i]) {
                    ind = j;
                }
            }
            kekw[i]=s[ind];
        }
        for (int i=0 ;i<kekw.length;i++)
        {
            if (i== kekw.length-1)
            {
                System.out.print(kekw[i]);
                break;
            }
            System.out.print(kekw[i]+" ");
        }

    }
}
