package Java8.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo6 {
    public static void main(String[] args) {
        String[] arr = {"Amit", "", "Ravi", null, "Raj", null, "Deepak", ""};

        Predicate<String> validNames = S -> S != null && S.length()!= 0;

        ArrayList<String> names = new ArrayList<>();

        for(String str : arr){
            if (validNames.test(str)) {
                names.add(str);
            }
        }

        System.out.println("Valid Names Are :");
        System.out.println(names);


    }
}
