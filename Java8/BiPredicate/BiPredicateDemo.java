package Java8.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        //Bipredicate accepts two arguments
        BiPredicate<Integer, Integer> p = (a,b) -> (a+b) % 2 == 0;

        System.out.println(p.test(10, 20));
        System.out.println(p.test(10, 25));
    }
}
