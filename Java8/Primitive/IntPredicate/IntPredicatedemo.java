package Java8.Primitive.IntPredicate;

import java.util.function.IntPredicate;

public class IntPredicatedemo {
    public static void main(String[] args) {

        int[] nums = {10,15,20,25,30,35};

        //Intpredicate accepts primitive int
        //It increases performance by avoiding auto boxing and auto unboxing of wrapper classes
        IntPredicate p = i -> i %2 == 0;

        for(int x : nums){
            if (p.test(x)) {
                System.out.println(x);
            }
        }
    }
}
