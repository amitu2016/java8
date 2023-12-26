package Java8.Function;

import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        Function<String, String> f = s -> s.replaceAll(" ", "");
        System.out.println(f.apply("Centre For Development Of Advanced Computing"));
    }
}
