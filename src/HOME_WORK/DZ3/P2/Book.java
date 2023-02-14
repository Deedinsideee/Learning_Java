package HOME_WORK.DZ3.P2;

import java.util.ArrayList;
import java.util.List;

//DZ3P2
public class Book {
    static int count =0;
    private int id;

    private List<Double> evaluations = new ArrayList<Double>();
    private String name;
    private String author;
    private Boolean isReading =false;

    public Book(String name, String author)
    {
        this.name = name;
        this.author=author;
        count++;
        id=count;

    }

    public void AddEvaluation(double s)
    {
        evaluations.add(s);
    }
    public double getEvaluations()
    {
        double s=0;

            for (int i = 0; i < evaluations.size(); i++) {
                s+= evaluations.get(i);
            }
            s=s/(double) evaluations.size();



        return s;
    }
    public Boolean getIsReading()
    {
        return isReading;
    }

    public void BookIsReading()
    {
        isReading =true;
    }
    public void BookIsBack()
    {
        isReading =false;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getAuthor(){return author;}
    public void showBook()
    {
        if (isReading)
            System.out.println(name + " "+ author + " chitaut");
        else
            System.out.println(name + " "+ author );
    }





}
