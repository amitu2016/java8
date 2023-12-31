package Java8.Function;

import java.util.function.Function;

public class FunctionDemo4 {
    public static void main(String[] args) {

        Function<String, String> f1 = s-> s.toUpperCase();
        Function<String, String> f2 = s -> s.substring(0, 9);

        String str = "Aishwaryaabhi";

        System.out.println(f1.apply(str));
        System.out.println(f2.apply(str));

        System.out.println(f1.andThen(f2).apply(str));
        System.out.println(f1.compose(f2).apply(str));


    }
}
