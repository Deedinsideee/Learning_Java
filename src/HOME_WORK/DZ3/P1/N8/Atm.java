package HOME_WORK.DZ3.P1.N8;




import java.util.Scanner;

public class Atm {
    private double dollar;
    private double rouble;
    public  static int count=0;

    public Atm()
    {
        count++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite kurs perevoda dolora v rubli");
        dollar=scanner.nextDouble();

        System.out.println("vvedite kurs perevoda rublya v dollar");
        rouble=scanner.nextDouble();

    }

    public double dollartorouble(double dollar)
    {
        return dollar*this.dollar;
    }
    public double rubletodollar(double rouble)
    {
        return rouble*this.rouble;
    }


    public static int countOfAtm()
    {
        return count;
    }




}
