package HOME_WORK.DZ3.P2;
//DZ3P2
public class Positetel {
    static int count =0;
    private int id;
    private String name;

    private int idknigi=0;


    public Positetel(String name)
    {
        this.name=name;
        count++;
        id=count;
    }

    public void ChitaetKnigu(int i)
    {
        idknigi=i;
    }
    public void OtdaetKnigu()
    {
        idknigi=0;
    }
    public int getIdknigi(){return idknigi;}


    public String getName(){return name;}
    public void showChel()
    {
        System.out.println(id+" "+name + " chitaet "+ idknigi);
    }

}
