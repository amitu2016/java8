package Java8.Predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
    

    public static void main(String[] args) {
     
        Predicate<String> p = S -> S.length() > 5;
        System.out.println(p.test("abcdef"));
        System.out.println(p.test("abc"));
    }
}
