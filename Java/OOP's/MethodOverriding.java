

class Calc {

    // Method Overloading - compile time polymorphism

    public int add(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

//    public int add(int num1, int num2){
//        return num1 + num2;
//    }

    public int add(double num1, double num2){
        return (int) (num1 + num2);
    }
}


public class MethodOverriding {
    public static void main(String[] args) {

        Calc obj = new Calc();
        int result = obj.add(5,3,6,6);
        int result1 = obj.add(6,4);
        int result2 = obj.add(6.5, 8.6);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}
