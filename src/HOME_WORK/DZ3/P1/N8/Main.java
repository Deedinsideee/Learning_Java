package HOME_WORK.DZ3.P1.N8;




public class Main {
    public static void main(String[] args) {
        Atm a= new Atm();
        System.out.println(a.dollartorouble(1));
        System.out.println(a.rubletodollar(70.1));
        System.out.println(Atm.countOfAtm());
        Atm b= new Atm();
        System.out.println(Atm.countOfAtm());
    }
}
