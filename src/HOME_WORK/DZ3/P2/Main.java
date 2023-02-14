package HOME_WORK.DZ3.P2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//DZ3P2
public class Main {
    public static void main(String[] args) {
        Biblioteka a = new Biblioteka();
        Scanner scanner = new Scanner(System.in);
        int i;
        while (true)
        {


                    System.out.println("1 - Dobavit knigu");
                    System.out.println("2 - Udalit knigu");
                    System.out.println("3 - Naity po nazv");
                    System.out.println("4 - Naity po author");
                    System.out.println("5 - POkazat ocenki knigi po nazv");
                    System.out.println("6 - Pokazat knigi");
                    System.out.println("7 - Pokazat posetitel");
                    System.out.println("8 - Vzyat knigu");
                    System.out.println("9 - Otdat knigu");
                    System.out.println("0 - exit");
                    i=scanner.nextInt();
                    if (i==1)
                    {
                        System.out.println("Vvedite nazv i author");
                        Book buff = new Book(scanner.next(), scanner.next());

                        a.AddBook(buff);


                    }
                    if (i==2)
                    {  System.out.println("Vvedite nazv ");
                        String s = scanner.next();
                        a.DeleteBook(s);
                    }
                    if (i==3)
                    {   System.out.println("Vvedite nazv ");
                        String s = scanner.next();
                        Book buff =a.FindBookByName(s);
                        buff.showBook();
                    }
                    if (i==4)
                    {   System.out.println("Vvedite  author");
                        String s = scanner.next();
                        List<Book> buffer = a.FindBookByauthor(s);
                        buffer.forEach(Book::showBook);
                    }
                    if (i==5)
                    {   System.out.println("Vvedite nazv ");
                        String s = scanner.next();
                        a.ShowEvaluationsOfBook(s);
                    }
                    if (i==6)
                    { a.showallBooks();}
                    if (i==7)
                    {a.showallCVisitors(); }
                    if(i==8)
                    {
                        System.out.println("Vvedite vshe imya ");
                        String s = scanner.next();
                        System.out.println("Vvedite nazv ");
                        String nameofBook = scanner.next();
                        a.Borrow(s,nameofBook);
                    }

                    if(i==9)
                    {

                        System.out.println("Vvedite vshe imya ");
                        String s = scanner.next();
                        System.out.println("Postavte ocenku Knigi");
                        double ke = scanner.nextDouble();
                        a.ReturnBook(s,ke);
                    }

                    if (i==0)
                    {break ;}



            }






        }
    }

