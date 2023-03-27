package HOME_WORK_PROF.DZ4;

import java.util.stream.IntStream;

public class N1 {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,100)
                .filter(c->c%2==0)
                .sum();
        System.out.println(sum);

    }
}
