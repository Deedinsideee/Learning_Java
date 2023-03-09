package HOME_WORK_PROF.DZ1.N6;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {


        //a
        try {
            System.out.println(FormValidator.checkName("Sss"));

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }



        //b
        try{

            System.out.println(FormValidator.checkBirthdate("10.02.1950" ));

        }
        catch (ParseException e)
        {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }


        //c
        try {
            System.out.println(FormValidator.checkGender("male"));
        } catch (IllegalArgumentException e) {
            System.err.println("Takogo gendera net");
        }

        //d
        try {
            System.out.println(FormValidator.checkHeight("19.1"));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
