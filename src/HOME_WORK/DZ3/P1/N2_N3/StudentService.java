package HOME_WORK.DZ3.P1.N2_N3;

import java.util.Arrays;
import java.util.Comparator;

public class StudentService {

    public static Student bestStudent(Student[] mass)
    {

        int ind = 0;
        double max=0;
        Student a;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].srgrade()>max)
            {
                max=mass[i].srgrade();
                ind=i;
            }
        }


        return mass[ind];
    }

    public static Student[] sortBySurname(Student[] mass)
    {

        Arrays.sort(mass, Comparator.comparing(Student::getSurname));


        return mass;
    }



}
