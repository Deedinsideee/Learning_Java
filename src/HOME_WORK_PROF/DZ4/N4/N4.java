package HOME_WORK_PROF.DZ4.N4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class N4 {
    public static void main(String[] args) {
        List<Double> doubles = List.of(1.2,1.4,1.1,2.1,3.1);
        sotr(doubles);
    }




    public static void sotr(List<Double> a )
    {
        a.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(c-> System.out.println(c));



    }
}
