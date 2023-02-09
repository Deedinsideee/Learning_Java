package HOME_WORK.DZ3.P1.N5;

public class Main {
    public static void main(String[] args) {
        DaysofWeek[] mas = {new DaysofWeek((byte) 1,"Monday"),new DaysofWeek((byte) 2,"Tuesday "),new DaysofWeek((byte) 3,"Wednesday "),new DaysofWeek((byte) 4,"Thursday "),new DaysofWeek((byte) 5,"Friday "),
                new DaysofWeek((byte) 6,"Saturday "),new DaysofWeek((byte) 7,"Sunday ")};
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i].n+" "+mas[i].day);

        }
    }
}
