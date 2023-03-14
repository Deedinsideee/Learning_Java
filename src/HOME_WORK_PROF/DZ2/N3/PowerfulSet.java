package HOME_WORK_PROF.DZ2.N3;

import java.util.Set;
import java.util.TreeSet;

public class PowerfulSet {
    public <T> Set<T> intersection(Set<T> set1, Set<T> set2)
    {
        set1.retainAll(set2);
        return set1;

    }

    public <T> Set<T> union(Set<T> set1, Set<T> set2)
    {
        TreeSet<T> buff = new TreeSet<>(set1);
        buff.addAll(set2);
        return buff;
    }

    public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2)
    {

        set1.removeAll(set2);
        return set1;
    }

}
