package HOME_WORK.DZ3.P1.N2_N3;

public class Student {
    private String name;
    private String surname;
    private int[] grades = new int[10];


    public String getName()
    {
        return name;

    }
    public void setName(String name){
        this.name=name;
    }


    public String getSurname()
    {
        return surname;

    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public int[] getGrades()
    {
        return grades;

    }
    public void setGrades(int[] grades){
        this.grades=grades;
    }



    public void addgrade(int a)
    {
        for (int i = 0; i <9; i++) {
            grades[i] = grades[i+1];
        }
        grades[9]=a;
    }

    public double srgrade()
    {   double summ=0;
        for (int i = 0; i < 10; i++) {
            summ+=grades[i];
        }
        return summ/9.0;

    }


}
