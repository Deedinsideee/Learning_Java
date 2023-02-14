package HOME_WORK.DZ3.P2;
//DZ3P2
public class Visitor {
    static int count =0;
    private int id;
    private String name;

    private int BookId =0;


    public Visitor(String name)
    {
        this.name=name;
        count++;
        id=count;
    }

    public void VisIsReading(int i)
    {
        BookId =i;
    }
    public void VisRetBook()
    {
        BookId =0;
    }
    public int getBookId(){return BookId;}


    public String getName(){return name;}
    public void showVis()
    {
        System.out.println(id+" "+name + " chitaet "+ BookId);
    }

}
