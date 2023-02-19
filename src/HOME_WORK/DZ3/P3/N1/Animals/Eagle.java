package HOME_WORK.DZ3.P3.N1.Animals;

import HOME_WORK.DZ3.P3.N1.Bird;
import HOME_WORK.DZ3.P3.N1.Flying;

public class Eagle extends Bird implements Flying {
    @Override
    public void Fly() {
        System.out.println("Flying fast");
    }
}
