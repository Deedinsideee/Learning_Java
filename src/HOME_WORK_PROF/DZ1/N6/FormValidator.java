package HOME_WORK_PROF.DZ1.N6;

import HOME_WORK.DZ3.P3.N1.Animals.Dolpthin;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormValidator {
    public static boolean checkName(String str) throws IOException {
        if(str.length()<20 && str.length()>2)
        {
            if(Character.isUpperCase(str.charAt(0)))
                return true;
            else
            {
                throw new IOException("Pervay bukva zaglavnaya ");
            }
        }
        else
        {
            throw new IOException("Dliba dolzna bit ot 2 do 20!! ");
        }
    }



    public static boolean checkBirthdate(String str) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date data= format.parse(str);
        Date data0 = format.parse( "01.01.1900");
        Date datenow = new Date();
        if (data.after(data0))
        {
            if (data.before(datenow))
                return true;
            else
                throw new Exception("data doljna bit ranshe seychas ");
        }
        else
        {
            throw new Exception("data doljna bit posle 01.01.1900 ");
        }
    }






    public static boolean  checkGender(String str) throws IllegalArgumentException {

            Gender enumObj = Gender.valueOf(str.toUpperCase());
            return true;




    }



    public static boolean  checkHeight(String str) throws Exception {
        try {
            double heist = Double.parseDouble(str);
            if(heist<1)
            {
                throw new Exception("Chislo doljno bit bolshe 0");
            }
            else
            {
                return true;
            }
        } catch (NumberFormatException e) {
            throw new Exception("eto ne chislo");
        }


    }



}
