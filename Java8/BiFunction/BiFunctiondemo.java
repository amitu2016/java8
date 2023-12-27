package Java8.BiFunction;

import java.util.function.BiFunction;

public class BiFunctiondemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> f = (a,b) -> a*b;

        System.out.println(f.apply(10, 20));
        System.out.println(f.apply(15, 25));
    }
}
