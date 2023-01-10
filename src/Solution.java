import java.util.Scanner;

public class Solution {
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
