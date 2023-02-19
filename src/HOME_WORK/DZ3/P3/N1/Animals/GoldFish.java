package HOME_WORK.DZ3.P3.N1.Animals;

import HOME_WORK.DZ3.P3.N1.Fish;
import HOME_WORK.DZ3.P3.N1.Swimming;

public class GoldFish extends Fish implements Swimming {
    @Override
    public void Swim() {
        System.out.println("Plivy medlenno");
    }
}
