package HOME_WORK_PROF.DZ1.N3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        try {

            var scanner = new Scanner(new File("input.txt"));
            var writter = new FileWriter("output.txt");
            try(scanner;writter) {
                while (scanner.hasNextLine())
                {
               /* String s = scanner.nextLine();
                System.out.println(s.toUpperCase());*/
                    writter.write(scanner.nextLine().toUpperCase(Locale.ROOT) + "\n");

                }
            }

        } catch (IOException e )
        {
            System.err.println("Файл не найден");
        }

    }
}
