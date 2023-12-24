package Java8.Predicate;

import java.util.function.Predicate;

public class PredicateDemo4 {
    public static void m1(Predicate<Integer> p, int[] arr){
       for(Integer x : arr){
            if (p.test(x)) {
                System.out.println(x);
            }
       }
    }


    public static void main(String[] args) {
        int[] arr = {0,5,10,15,20,25,30,35};
        Predicate<Integer> p1 = I1 -> I1 > 10;
        Predicate<Integer> p2 = I2 -> I2 % 2 == 0;

        System.out.println("Numbers greater 10 are :");
        m1(p1, arr);

        System.out.println("Numbers which are even :");
        m1(p2, arr);

        System.out.println("Numbers which are less than 10 are :");
        m1(p1.negate(), arr);

        System.out.println("Numbers which are odd :");
        m1(p2.negate(), arr);

        System.out.println("Numbers which are even and greater than 10");
        m1(p2.and(p1), arr);

        System.out.println("Numbers which are even or greater than 10");
        m1(p2.or(p1), arr);

    }
}
