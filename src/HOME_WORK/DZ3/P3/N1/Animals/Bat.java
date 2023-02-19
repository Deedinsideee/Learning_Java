package HOME_WORK.DZ3.P3.N1.Animals;

import HOME_WORK.DZ3.P3.N1.Flying;
import HOME_WORK.DZ3.P3.N1.Mammal;

public class Bat extends Mammal implements Flying {
    @Override
    public void Fly() {
        System.out.println("Flying slowly");
    }
}
