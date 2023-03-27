package HOME_WORK_PROF.DZ4.N6;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class N6 {
    public static void main(String[] args) {
        Set<Set<Integer>> a = Set.of(Set.of(1,2,3),Set.of(4,5,6));
        Set<Integer> res = a.stream()
                .flatMap(Set::stream)
                .collect(Collectors.toSet());

        System.out.println(res );
    }
}
