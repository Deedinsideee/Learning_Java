package HOME_WORK_PROF.DZ4.N2;

import java.util.List;

public class Multi {


    public static int multi(List<Integer> k )
    {
          int result=  k.stream()
                    .reduce(1,(a,b)->a*b);





        return result;
    }
}
