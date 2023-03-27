package HOME_WORK_PROF.DZ4.N5;

import java.util.List;
import java.util.stream.Collectors;

public class N5 {
    public static void main(String[] args) {

        List<String> strings = List.of("abc", "def", "qqq");
        func(strings);



    }




    public static void func(List<String> s )
    {
       /* s.stream()
                .map(String::toUpperCase)
                .forEach(s1 -> System.out.print(s1+","));*/
       String res = s.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(res);
    }
}
