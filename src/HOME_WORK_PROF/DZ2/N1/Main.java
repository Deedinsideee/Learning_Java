package HOME_WORK_PROF.DZ2.N1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ints = new ArrayList<>();
        ints.add("1");
        ints.add("2");
        ints.add("3");
        ints.add("4");
        ints.add("5");
        ints.add("1");
        ints.add("1");

        var s = kekw(ints);
        for(String i: s)
        {
            System.out.println(i);
        }
    }

    public static <T> ArrayList<T> kekw (ArrayList<T> list)
        {
            TreeSet<T> ns = new TreeSet<T>(list);
            return new ArrayList<T>(ns);
        }






}


