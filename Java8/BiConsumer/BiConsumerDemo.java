package Java8.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        //Biconsumer to take to string and concatenate 
        BiConsumer<String,String> c = (s1,s2) -> System.out.println(s1+s2);

        c.accept("Amit", "Upadhyay");
    }
    
}
