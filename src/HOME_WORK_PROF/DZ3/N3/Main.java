package HOME_WORK_PROF.DZ3.N3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            APrinter aPrinter= new APrinter();

            Method method = aPrinter.getClass().getDeclaredMethod("printf", int.class);

            method.invoke(aPrinter,12);

        } catch (InvocationTargetException e) {
            System.out.println("Iskluchenit kotoroe ya ne ponyal((");
        } catch (NoSuchMethodException e) {
            System.out.println("Привет");
        } catch (IllegalAccessException e) {
            System.out.println("Net dostupa");
        }
    }
}
