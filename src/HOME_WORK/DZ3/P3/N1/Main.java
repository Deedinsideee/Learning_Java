package HOME_WORK.DZ3.P3.N1;

import HOME_WORK.DZ3.P3.N1.Animals.Bat;
import HOME_WORK.DZ3.P3.N1.Animals.Dolpthin;
import HOME_WORK.DZ3.P3.N1.Animals.Eagle;
import HOME_WORK.DZ3.P3.N1.Animals.GoldFish;

public class Main {
    public static void main(String[] args) {
        Bat bat=new Bat();
        bat.Birthding();
        bat.Fly();
        bat.Eat();
        bat.Sleep();
        System.out.println();


        Dolpthin dolpthin=new Dolpthin();
        dolpthin.Birthding();
        dolpthin.Swim();
        dolpthin.Eat();
        dolpthin.Sleep();

        System.out.println();

        Eagle eagle=new Eagle();
        eagle.Birthding();
        eagle.Fly();
        eagle.Eat();
        eagle.Sleep();
        System.out.println();

        GoldFish goldFish=new GoldFish();
        goldFish.Birthding();
        goldFish.Swim();
        goldFish.Eat();
        goldFish.Sleep();

    }
}
