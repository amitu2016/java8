package Java8.Function;

import java.util.function.Function;

public class Functiondemo6 {
    public static void main(String[] args) {

        //Static function identity returns the same data itself
        Function<String, String> f = Function.identity();

        System.out.println(f.apply("Amit"));  // o/p : Amit
    }
}
