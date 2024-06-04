interface Harsh
{
    default void show()
    {
        System.out.println("in Harsh show");
    }
}
interface Uday
{
    default void show()
    {
        System.out.println("in Uday show");
    }
}

class Anurag implements Harsh, Uday
{
    public void show()
    {
       Harsh.super.show();
    }
}


public class AmbiguityIssue {
    public static void main(String[] args) {

            Harsh obj = new Anurag();
            obj.show();

    }
}
