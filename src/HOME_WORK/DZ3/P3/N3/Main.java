package HOME_WORK.DZ3.P3.N3;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<ArrayList<Integer>> mass = new ArrayList();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> arr1  = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(i+j);
            }
            mass.add(arr1);
        }


        mass.forEach(s->{
            System.out.println();
            s.forEach(k->{
            System.out.print(k+" ");
        });
        });

    }
}
