package HOME_WORK.DZ3.P3.N4;

import java.util.ArrayList;

public class Dog extends Participant  {
    private String name;
    private double score;
    Dog(String name,String ownerName)
    {
        super(ownerName);
        score=0;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setScore(ArrayList<Integer> score) {
        for (int i = 0; i < score.size(); i++) {
            this.score+=score.get(i);
        };
        this.score=this.score/3;
    }

    public double getScore() {
        return score;
    }
}
