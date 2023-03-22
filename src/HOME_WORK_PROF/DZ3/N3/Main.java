package HOME_WORK_PROF.DZ3.N3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            APrinter aPrinter= new APrinter();

            Method method = aPrinter.getClass().getDeclaredMethod("print", int.class);

            method.invoke(aPrinter,74);

        } catch (InvocationTargetException e) {
            System.out.println("Iskluchenit kotoroe ya ne ponyal((");
        } catch (NoSuchMethodException e) {
            System.out.println("Takogo metoda net");
        } catch (IllegalAccessException e) {
            System.out.println("Net dostupa");
        }
    }
}
