package HOME_WORK.DZ3.P2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//DZ3P2
public class Biblioteka {


    private List<Book> books = new ArrayList<Book>() {{
        add(new Book("Otsi i deti", "Turgenev"));
        add(new Book("Voina i mir", "Tolstoy"));
        add(new Book("Vedmak", "Sapkovskiy"));
        add(new Book("r", "r"));
        add(new Book("s", "r"));
        add(new Book("t", "r"));
        add(new Book("p", "r"));

    }};

    private List<Visitor> visitors = new ArrayList<Visitor>() {{
        add(new Visitor("Petya"));
        add(new Visitor("Vasya"));
        add(new Visitor("Ollya"));
        add(new Visitor("r"));

    }};




    public void showallBooks() {
        books.forEach(Book::showBook);
    }

    public void showallCVisitors() {
        visitors.forEach(Visitor::showVis);
    }

    //Добавить книгу
    public void AddBook(Book buff) {

        Boolean kek = true;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(buff.getName())) {
                kek = false;
                break;
            }
        }
        if (kek) {
            books.add(buff);
            System.out.println("Kniga dobavlena");
        } else {
            Book.count--;
            System.out.println("Kniga uje est'");
        }

    }

    //Удалить Книгу
    public void DeleteBook(String s) {

        Boolean kek = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(s)) {
                if (books.get(i).getIsReading()) {
                    System.out.println("kniga zanyata");
                } else {
                    books.remove(i);
                    System.out.println("Kniga udalena");
                }
                break;
            } else if (i == books.size() - 1) {
                System.out.println("Takoy knigi net");
            }
        }


    }
    //Найти книгу по названию
    public Book FindBookByName(String s) {

        Boolean kek = true;
        int i =0;
        for ( i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(s)) {

                break;

            } else if (i == books.size() - 1) {
                System.out.println("Takoy knigi net");
            }

        }
        return books.get(i);
    }

    //Найти книгу по Автору
    public List<Book> FindBookByauthor(String s) {

        List<Book> buffer = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(s)) {
                buffer.add(books.get(i));

            }
        }
        return buffer;
    }

    //Одолжить книгу
    public void Borrow(String name,String nameofBook) {
        int indofchel = 0;


        for (int i = 0; i < visitors.size(); i++) {
            if (visitors.get(i).getName().equals(name)) {

                indofchel = i;

                break;
            } else
                if (i == books.size() - 1) {
                indofchel = books.size();
                System.out.println("Vi noviy polzovatel!!!!");
                System.out.println("VASH IND = " + indofchel);
                visitors.add(new Visitor(name));
                break;
            }

        }



        Boolean kek = true;


        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(nameofBook)) {
                if (visitors.get(indofchel).getBookId() == 0) {
                    if ( !books.get(i).getIsReading()) {
                        books.get(i).BookIsReading();
                        visitors.get(indofchel).VisIsReading(books.get(i).getId());
                        break;
                    }
                    else{
                        System.out.println("Etu Knigu chitaut");
                        break;
                    }
                }
                else
                {
                    System.out.println("Vi chitaete druguu knigu");
                    break;
                }

            }
            else if (i == books.size() - 1) {
                System.out.println("Takoy knigi net");

            }

        }
    }

    //Вернуть книгу
    public void ReturnBook(String s,double ke) {
        int indofchel = 0;


        Boolean kek = false;
        for (int i = 0; i < visitors.size(); i++) {
            if (visitors.get(i).getName().equals(s)) {

                indofchel = i;
                kek = true;


            }


        }
        if (kek) {
            if (visitors.get(indofchel).getBookId() != 0) {


                books.get(visitors.get(indofchel).getBookId()-1).AddEvaluation(ke);
                books.get(visitors.get(indofchel).getBookId()-1).BookIsBack();
                visitors.get(indofchel).VisRetBook();
            } else
                System.out.println("Vi ne brali knigu");
        } else
            System.out.println("Vi ni razy ne bili v boblio");


        }




        //Показать оценки книги
        public void ShowEvaluationsOfBook(String s)
        {

            Boolean kek = true;
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getName().equals(s)) {
                    System.out.println( books.get(i).getEvaluations());
                    break;

                } else if (i == books.size() - 1) {
                    System.out.println("Takoy knigi net");
                }

            }
        }


}
