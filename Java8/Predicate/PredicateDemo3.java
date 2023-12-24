package Java8.Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo3 {
    public static void main(String[] args) {
        //Check whether collection is empty or not
        Predicate<Collection<Integer>> p = C -> C.isEmpty();

        ArrayList<Integer> i1 = new ArrayList<>();
        i1.add(1);
        System.out.println(p.test(i1));

        ArrayList<Integer> i2 = new ArrayList<>();
         System.out.println(p.test(i2));

    }
}
