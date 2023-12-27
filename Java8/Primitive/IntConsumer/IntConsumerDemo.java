package Java8.Primitive.IntConsumer;

import java.util.function.IntConsumer;

public class IntConsumerDemo {
    public static void main(String[] args) {
        //intconsumer only accepts primitive int value
        IntConsumer c = i -> System.out.println("Square of "+i+" is "+i*i);
        c.accept(34);
    }
}
