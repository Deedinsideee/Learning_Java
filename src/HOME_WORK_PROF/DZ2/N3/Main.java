package HOME_WORK_PROF.DZ2.N3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Set<Integer> s1 = new TreeSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);



        Set<Integer> s2 = new HashSet<>();

        s2.add(0);
        s2.add(1);
        s2.add(2);

        var kek = new PowerfulSet();

        //A
        Set<Integer> s3 = new HashSet<>();
        /*s3 = kek.intersection(s1,s2);
        for( Integer i : s3)
        {
            System.out.println(i);
        }*/


        //B
            /*s3 = kek.union(s1,s2);
            for( Integer i : s3) {
            System.out.println(i);
        }*/

        //C
        s3 = kek.relativeComplement(s1,s2);
        for( Integer i : s3) {
            System.out.println(i);
        }


    }
}
