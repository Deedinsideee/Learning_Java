package HOME_WORK.DZ3.P2;

import java.util.ArrayList;
import java.util.List;

public class Kniga {
    static int count =0;
    private int id;

    private List<Double> ocenki = new ArrayList<Double>();
    private String nazv;
    private String author;
    private Boolean ischitaet=false;

    public Kniga(String nazv, String author)
    {
        this.nazv=nazv;
        this.author=author;
        count++;
        id=count;

    }

    public void Addocenku(double s)
    {
        ocenki.add(s);
    }
    public double getOcenki()
    {
        double s=0;

            for (int i = 0; i < ocenki.size(); i++) {
                s+=ocenki.get(i);
            }
            s=s/(double)ocenki.size();



        return s;
    }
    public Boolean getIschitaet()
    {
        return ischitaet;
    }

    public void KnigyChitaut()
    {
        ischitaet=true;
    }
    public void KnigyOtdut()
    {
        ischitaet=false;
    }
    public int getId()
    {
        return id;
    }
    public String getNazv()
    {
        return nazv;
    }
    public String getAuthor(){return author;}
    public void showKniga()
    {
        if (ischitaet)
            System.out.println(nazv + " "+ author + " chitaut");
        else
            System.out.println(nazv + " "+ author );
    }





}
