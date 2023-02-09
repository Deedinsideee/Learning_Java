package HOME_WORK.DZ3.P2;

import java.util.Scanner;
//DZ3P2
public class Main {
    public static void main(String[] args) {
        Biblioteka a = new Biblioteka();
        Scanner scanner = new Scanner(System.in);
        int i;
        while (true)
        {
            System.out.println("1 - deystvia s knigami");
            System.out.println("2 - vzyat ili otdat knigy");
            System.out.println("0 - exit");
            i=scanner.nextInt();
            if (i==0)
            {
                break;
            }
            if (i==1)
            {
               while (true)
                {

                    System.out.println("1 - Dobavit knigu");
                    System.out.println("2 - Udalit knigu");
                    System.out.println("3 - Naity po nazv");
                    System.out.println("4 - Naity po author");
                    System.out.println("5 - POkazat ocenki knigi po nazv");
                    System.out.println("6 - Pokazat knigi");
                    System.out.println("7 - Pokazat posetitel");
                    System.out.println("0 - exit");
                    i=scanner.nextInt();
                    if (i==1)
                    {a.AddKniga(); }
                    if (i==2)
                    { a.DeleteKniga();}
                    if (i==3)
                    { a.FindKnigabynazv();}
                    if (i==4)
                    {a.FindKnigiByauthor(); }
                    if (i==5)
                    {a.ShowOcenkiKnigi(); }
                    if (i==6)
                    { a.showallKnigi();}
                    if (i==7)
                    {a.showallCheli(); }
                    if (i==0)
                    {break ;}

                }
            }
            if (i==2)
            {
                 while (true)
                {
                    System.out.println("1 - Vzyat knigu");
                    System.out.println("2 - Otdat knigu");
                    System.out.println("0 - exit");
                    i=scanner.nextInt();
                    if(i==1)
                        a.Odoljit();
                    if(i==2)
                        a.Vernut();
                    if(i==0)
                        break ;
                }


            }





        }
    }
}
