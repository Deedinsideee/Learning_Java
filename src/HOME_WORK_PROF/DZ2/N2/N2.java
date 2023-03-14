package HOME_WORK_PROF.DZ2.N2;

import java.util.*;

public class N2 {
    public static void main(String[] args) {
    String s = "sdssdsdsds";
    String d = "dssdsdsds";

        System.out.println(iftrue(s,d));


    }




    public static boolean iftrue (String s, String t)
    {

        TreeSet<Character> k = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            k.add(s.charAt(i));
        }

        TreeSet<Character> k2 = new TreeSet<>();
        for (int i = 0; i < t.length(); i++) {
            k2.add(t.charAt(i));
        }





        return k.equals(k2);
    }
}
