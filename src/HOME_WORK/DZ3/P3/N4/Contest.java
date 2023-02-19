package HOME_WORK.DZ3.P3.N4;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.List;

public class Contest {
    int n;
    ArrayList<Participant> participants;
    ArrayList<Dog> dogs;


    Contest(int n,ArrayList<Dog> dogs)
    {
        this.n=n;
        this.dogs=dogs;
        this.participants=participants;
    }

    public void Scoring(ArrayList<Integer> a,int ind)
    {
        dogs.get(ind).setScore(a);
    }
    public ArrayList<Dog> Final()
    {


        ArrayList<Dog> buff= new ArrayList<>();
        int buffs;
        for (int i = 0; i < 3; i++) {
            buffs=max();
            buff.add(dogs.get(buffs));
            dogs.remove(buffs);
            n--;
        }
        return buff;

    }

    private int max()
    {
        int ind=0;
        double max = dogs.get(0).getScore();
        for (int i = 0; i < n; i++) {

            if( max < dogs.get(i).getScore())
            {
                max = dogs.get(i).getScore();
                ind = i;
            }

        }

        return ind;
    }


}
