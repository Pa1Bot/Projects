// Collection
// ArrayList


import java.util.ArrayList;

public class forEach_MethodUsing_Lambda {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(6);
        nums.add(2);
        nums.add(9);

        System.out.println(nums);

        for(int num : nums)
        {
            System.out.println(num);
        }


        nums.forEach(num -> System.out.println(num));



    }
}

// List interface       : 3 abstract methods + 1 default method
// ArrayList class         : 3 impl
// LinkedList class         : 3 impl

