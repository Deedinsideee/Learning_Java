package HOME_WORK.DZ3.P1.N2_N3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student vanya = new Student();
        vanya.setName("Vanya");
        System.out.println(vanya.getName());
        vanya.setSurname("Zetev");
        System.out.println(vanya.getSurname());
        vanya.setGrades(new int[]{1, 2, 3, 4, 5, 6, 7,8,9,10});
        int[] mass = vanya.getGrades();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+" ");

        }
        System.out.println();

      /*  vanya.addgrade(5);
        mass = vanya.getGrades();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+" ");

        }
        System.out.println();
        System.out.println(vanya.srgrade());*/

        Student sanya = new Student();
        sanya.setName("Sanya");
        System.out.println(vanya.getName());
        sanya.setSurname("Sanyev");
        System.out.println(vanya.getSurname());
        sanya.setGrades(new int[]{10, 20, 30, 40, 50, 60, 70,80,90,10});
        mass = sanya.getGrades();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+" ");

        }
        System.out.println();



        Student[] massiv = {vanya,sanya};

        Student best = StudentService.bestStudent(massiv);
        System.out.println(best.getSurname()+" "+ best.getName()+" "+best.srgrade());

        massiv=StudentService.sortBySurname(massiv);
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i].getSurname());
        }


    }
}
