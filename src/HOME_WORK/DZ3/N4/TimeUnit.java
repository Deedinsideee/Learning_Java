package HOME_WORK.DZ3.N4;

public class TimeUnit {
    private int hour;
    private int minute;
    private int sec;
    public TimeUnit(int hour,int minute,int sec)
    {
        this.hour=hour;
        this.minute=minute;
        this.sec=sec;
    }
    public TimeUnit(int hour,int minute)
    {
        this.hour=hour;
        this.minute=minute;
        this.sec=0;
    }
    public TimeUnit(int hour)
    {
        this.hour=hour;
        this.minute=0;
        this.sec=0;
    }

    public void ShowTime()
    {
        System.out.println(hour+":"+minute+":"+sec);
    }
    public void ShowTime12()
    {
        if (hour>12)
        {

            System.out.println((hour-12)+":"+minute+":"+sec + " pm");
        }
        else
            System.out.println(hour+":"+minute+":"+sec+ " am");
    }

    public void PribavTime(int hour,int minute,int sec)
    {
        for (int k = sec; k >0; k--) {
            if(this.sec==60)
            {
                this.sec=0;
                this.minute++;
            }
            this.sec++;
        }
        for (int j = minute; j >0; j--)
        {

            if(this.minute==60)
            {
                this.minute=0;
                this.hour++;
            }
            this.minute++;

        }
        for (int i = hour;i>0;i--)
        {

            if(this.hour==24)
            {
                this.hour=0;

            }
            this.hour++;


        }



    }



}
