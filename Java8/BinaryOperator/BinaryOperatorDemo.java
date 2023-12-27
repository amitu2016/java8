package Java8.BinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        //When all arguments of BiFunction is same
        BinaryOperator<String> o = (s1, s2) -> s1 + s2;

        System.out.println(o.apply("durga", "soft"));
    }
}
