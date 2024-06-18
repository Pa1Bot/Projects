
// 3 Types of Interface
// 1. Normal Interface - More than 1
// 2. SAM Interface - Single Abstract Method Interface - Functional Interface
// 3. Marker Interface - 0 methods

interface Calc
{
    void show();
}

public class LambdaExpression_1
{
    public static void main(String[] args)
    {
//        Calc obj = new Calc()
//        {
//            public void show()
//            {
//                System.out.println("in show");
//            }
//        };
//        obj.show();

        Calc obj = () -> System.out.println("in show1");             // Lambda Expression

        obj.show();



    }
}
