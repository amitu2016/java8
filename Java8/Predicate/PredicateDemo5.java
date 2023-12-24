package Java8.Predicate;

import java.util.function.Predicate;

public class PredicateDemo5 {
    public static void main(String[] args) {
        String [] act = {"Sunny", "Katrina", "Mallika", "Kareena", "Kajal"};
        Predicate<String> startsWithK = S -> S.charAt(0) == 'K';

        for(String s : act){
            if(startsWithK.test(s)){
                System.out.println(s);
            }
        }
    }
}
