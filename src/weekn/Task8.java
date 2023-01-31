package weekn;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        System.out.println(reverseString(input));
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            System.out.println("str.charAt(0): " + str.charAt(0));
            System.out.println("str.substring(1): " + str.substring(1));
            System.out.println();
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}

