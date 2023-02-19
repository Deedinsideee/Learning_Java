package HOME_WORK.DZ3.P3.N4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<String> participants = new ArrayList<>();

        System.out.println("Vvedite imena uchastnikov");
        for (int i = 0; i < n; i++) {
            participants.add(scanner.next());
        }
        System.out.println("Vvedite imena sobak");
        for (int i = 0; i < n; i++) {
            dogs.add(new Dog(scanner.next(),participants.get(i)));
        }
        Contest a = new Contest(n,dogs);



        System.out.println("Vvedite ocenki sobak");
        ArrayList<Integer> buff= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buff= new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                buff.add(scanner.nextInt());
            }
            a.Scoring(buff,i);

        }

         dogs = a.Final();
         dogs.forEach(e->{
             System.out.println(e.getOwnerName()+": "+e.getName()+", "+e.getScore() );


         });


    }
}
