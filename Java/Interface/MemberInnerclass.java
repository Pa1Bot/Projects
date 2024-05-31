class A {

    public void show() {
        System.out.println("in A show");

    }

    static class B {                           // Member inner class
        public void show()
        {
            System.out.println("in B Show");
        }
    }

}
// Member inner class
//// static inner class
//// Anonymous Inner class

public class MemberInnerclass {
    public static void main(String[] args) {
            A obj = new A();
           // obj.show();
// to create the object of member inner class we need object of outer class
      //      A.B obj1 = obj.new B();

        A.B obj1 = new A.B();


            obj1.show();



    }
}
