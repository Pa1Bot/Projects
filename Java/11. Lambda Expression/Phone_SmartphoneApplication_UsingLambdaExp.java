
@FunctionalInterface
interface Phone
{
    int add(int num1, int num2);
    default void show()
    {
        System.out.println("hi");
    }
}
interface SmartPhone
{
    int convertIntoINR(int usd);
}
public class Phone_SmartphoneApplication_UsingLambdaExp {


    public static void main(String[] args) {


//        Phone p1 = new Phone() {
//            public int add(int num1, int num2) {
//                return num1 + num2;
//            }
//        };

        Phone p = (num1,num2) -> num1 + num2;


        SmartPhone sp = usd -> usd*82;
        System.out.println(sp.convertIntoINR(10));


        int result = p.add(4,7);
        System.out.println(result);


    }
}



