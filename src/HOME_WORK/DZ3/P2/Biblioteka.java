package HOME_WORK.DZ3.P2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Biblioteka {
    Scanner scanner = new Scanner(System.in);

    private List<Kniga> knigi = new ArrayList<Kniga>() {{
        add(new Kniga("Otsi i deti", "Turgenev"));
        add(new Kniga("Voina i mir", "Tolstoy"));
        add(new Kniga("Vedmak", "Sapkovskiy"));
        add(new Kniga("r", "r"));
      /*  add(new Kniga("s", "r"));
        add(new Kniga("t", "r"));
        add(new Kniga("p", "r"));*/

    }};

    private List<Positetel> posetiteli = new ArrayList<Positetel>() {{
        add(new Positetel("Petya"));
        add(new Positetel("Vasya"));
        add(new Positetel("Ollya"));
        add(new Positetel("r"));

    }};


    public void showallKnigi(List<Kniga> knigi) {
        knigi.forEach(Kniga::showKniga);
    }

    public void showallKnigi() {
        knigi.forEach(Kniga::showKniga);
    }

    public void showallCheli() {
        posetiteli.forEach(Positetel::showChel);
    }

    public void AddKniga() {
        System.out.println("Vvedite nazv i author");
        Kniga buff = new Kniga(scanner.next(), scanner.next());
        Boolean kek = true;
        for (int i = 0; i < knigi.size(); i++) {
            if (knigi.get(i).getNazv().equals(buff.getNazv())) {
                kek = false;
                break;
            }
        }
        if (kek) {
            knigi.add(buff);
            System.out.println("Kniga dobavlena");
        } else {
            Kniga.count--;
            System.out.println("Kniga uje est'");
        }

    }


    public void DeleteKniga() {
        System.out.println("Vvedite nazv ");
        String s = scanner.next();
        Boolean kek = false;

        for (int i = 0; i < knigi.size(); i++) {
            if (knigi.get(i).getNazv().equals(s)) {
                if (knigi.get(i).getIschitaet()) {
                    System.out.println("kniga zanyata");
                } else {
                    knigi.remove(i);
                    System.out.println("Kniga udalena");
                }
                break;
            } else if (i == knigi.size() - 1) {
                System.out.println("Takoy knigi net");
            }
        }


    }

    public void FindKnigabynazv() {
        System.out.println("Vvedite nazv ");
        String s = scanner.next();
        Boolean kek = true;
        for (int i = 0; i < knigi.size(); i++) {
            if (knigi.get(i).getNazv().equals(s)) {
                knigi.get(i).showKniga();
                break;

            } else if (i == knigi.size() - 1) {
                System.out.println("Takoy knigi net");
            }

        }
    }


    public void FindKnigiByauthor() {
        System.out.println("Vvedite  author");
        String s = scanner.next();
        List<Kniga> buffer = new ArrayList<>();
        for (int i = 0; i < knigi.size(); i++) {
            if (knigi.get(i).getAuthor().equals(s)) {
                buffer.add(knigi.get(i));

            }
        }
        showallKnigi(buffer);
    }

    public void Odoljit() {
        int indofchel = 0;

        System.out.println("Vvedite vshe imya ");
        String s = scanner.next();
        for (int i = 0; i < posetiteli.size(); i++) {
            if (posetiteli.get(i).getName().equals(s)) {

                indofchel = i;
                System.out.println("Vi STARIY polzovatel!");
                break;
            } else
                if (i == knigi.size() - 1) {
                indofchel = knigi.size();
                System.out.println("Vi noviy polzovatel!!!!");
                System.out.println("VASH IND = " + indofchel);
                posetiteli.add(new Positetel(s));
            }

        }


        System.out.println("Vvedite nazv ");
        s = scanner.next();
        Boolean kek = true;


        for (int i = 0; i < knigi.size(); i++) {
            if (knigi.get(i).getNazv().equals(s)) {
                if (posetiteli.get(indofchel).getIdknigi() == 0) {
                    if ( !knigi.get(i).getIschitaet()) {
                        knigi.get(i).KnigyChitaut();
                        posetiteli.get(indofchel).ChitaetKnigu(knigi.get(i).getId());
                        break;
                    }
                    else System.out.println("Etu Knigu chitaut");
                }
                else System.out.println("Vi chitaete druguu knigu");


            } else if (i == knigi.size() - 1) {
                System.out.println("Takoy knigi net");
            }

        }
    }


    public void Vernut() {
        int indofchel = 0;

        System.out.println("Vvedite vshe imya ");
        String s = scanner.next();
        Boolean kek = false;
        for (int i = 0; i < posetiteli.size(); i++) {
            if (posetiteli.get(i).getName().equals(s)) {

                indofchel = i;
                kek = true;
                System.out.println("Vi STARIY polzovatel!");

            }


        }
        if (kek) {
            if (posetiteli.get(indofchel).getIdknigi() != 0) {
                System.out.println("Ocenite Knigu");
                double ke = scanner.nextDouble();
                knigi.get(posetiteli.get(indofchel).getIdknigi()-1).Addocenku(ke);
                knigi.get(posetiteli.get(indofchel).getIdknigi()-1).KnigyOtdut();
                posetiteli.get(indofchel).OtdaetKnigu();
            } else
                System.out.println("Vi ne brali knigu");
        } else
            System.out.println("Vi ni razy ne bili v boblio");


        }

        public void ShowOcenkiKnigi()
        {
            System.out.println("Vvedite nazv ");
            String s = scanner.next();
            Boolean kek = true;
            for (int i = 0; i < knigi.size(); i++) {
                if (knigi.get(i).getNazv().equals(s)) {
                    System.out.println( knigi.get(i).getOcenki());
                    break;

                } else if (i == knigi.size() - 1) {
                    System.out.println("Takoy knigi net");
                }

            }
        }


}
