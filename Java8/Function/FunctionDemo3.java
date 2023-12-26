package Java8.Function;

import java.util.function.Function;

public class FunctionDemo3 {
    public static void main(String[] args) {
        //Find out the length of string without spaces
        Function<String, Integer> f = s -> s.length() - s.replaceAll(" ","").length();

        String str = "Centre For Development Of Advanced Computing";
        System.out.println(f.apply(str));
    }
}
