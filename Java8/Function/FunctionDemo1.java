package Java8.Function;

import java.util.function.Function;

public class FunctionDemo1 {
    
    public static void main(String[] args) {
        //Java 8 Functional Interface (Function)

        //Find length of given string
        Function<String, Integer> f = s -> s.length();

        System.out.println(f.apply("Amit"));
        System.out.println(f.apply("Upadhyay"));
        System.out.println("**********************************************");

        //Find square of given integer
        Function<Integer, Integer> f1 = i -> i*i;
        System.out.println(f1.apply(8));
        System.out.println(f1.apply(9));
        System.out.println("**********************************************");
        
    }

}
