package HOME_WORK_PROF.DZ4.N3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "", "", "def", "qqq",""," sd"," ","ds","");
        System.out.println(str(list));







    }


    public static long str(List<String> list) {

        long count = list.stream()
                .filter(c->c!="")
                .count();
    return count;
    }
}
