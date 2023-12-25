package Java8.Function;

import java.util.function.Function;

public class FunctionDemo1 {
    
    public static void main(String[] args) {
        //Java 8 Functional Interface (Function)
        
        //Find length of given string
        Function<String, Integer> f = s -> s.length();

        System.out.println(f.apply("Amit"));
        System.out.println(f.apply("Upadhyay"));
    }

}
