package Java8.Predicate;

import java.util.function.Predicate;

/**
 * PredicateDemo1
 */
public class PredicateDemo1 {

    public static void main(String[] args) {
        //Predicate functional Interface
        Predicate<Integer> p = I -> I > 10;
        
        System.out.println(p.test(100));
        System.out.println(p.test(5));

    }
}