package Java8.Primitive.IntFunction;

import java.util.function.IntFunction;

public class IntFunctionDemo {
    public static void main(String[] args) {
        IntFunction<Integer> f = i -> i * i;

        System.out.println(f.apply(25));

    }
}
