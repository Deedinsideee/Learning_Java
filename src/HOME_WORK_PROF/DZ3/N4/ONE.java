package HOME_WORK_PROF.DZ3.N4;

public class ONE extends SEVEN implements TWO {
    public static void main(String[] args) {
unterfaces(ONE.class);

}



public static  void unterfaces(Class<?> clazz)
    {

        try {


                if (clazz.getSuperclass()==null)
                {

                }
                else {
                    System.out.println(clazz.getSuperclass());
                    unterfaces(clazz.getSuperclass());
                }



            for (Class<?> clazz1 : clazz.getInterfaces() )
            {

                System.out.println(clazz1.getName());
                unterfaces(clazz1);
            }
        } catch (Exception e) {

        }
    }














}
