package HOME_WORK_PROF.DZ1.N4;

import java.io.IOException;

public class MyEvenNumber {
    int n;
    MyEvenNumber(int n)
    {
        try {
            if(n%2!=0)
            {
                throw new IOException();
            }
            else{
                this.n=n;
                System.out.println("Vse ok");
            }
        } catch (IOException e) {
            System.err.println("Nevozmojno");
        }
    }
}
