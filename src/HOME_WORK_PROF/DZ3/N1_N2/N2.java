package HOME_WORK_PROF.DZ3.N1_N2;

import java.lang.instrument.ClassDefinition;

public class N2 {
    public static void main(String[] args) {
        writeAnnotation(N1.class);
    }




    public static void writeAnnotation(Class<?> clazz)
    {
        if (!clazz.isAnnotationPresent(IsLike.class))
        {
            System.out.println("net annotatii");
        }
        else
        {
            IsLike islike = clazz.getAnnotation(IsLike.class);
            System.out.println("znachenie annotatii" +islike.a());
        }
    }
}
