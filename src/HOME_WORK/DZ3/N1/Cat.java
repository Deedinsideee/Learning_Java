package HOME_WORK.DZ3.N1;

public class Cat {
    private void sleep(){
        System.out.println("Sleep");
    }
    private void meow() {
        System.out.println("Meow");
    }
    private void eat() {
        System.out.println("Eat");

    }
    public void status()
    {
        int i = (int)Math.random()*3;
        if (i==1)
        {
            sleep();
        } else if (i==2) {
           meow();
        }
        else {
            eat();
        }
    }

}

