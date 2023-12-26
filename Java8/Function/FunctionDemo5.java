package Java8.Function;

import java.util.function.Function;

public class FunctionDemo5 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i + i;
        Function<Integer, Integer> f2 = i ->  i * i * i;

        //First f1 will be applied and then f2
        System.out.println(f1.andThen(f2).apply(2));

        //First f2 will be applied and then f1
        System.out.println(f1.compose(f2).apply(2));
    }
}
