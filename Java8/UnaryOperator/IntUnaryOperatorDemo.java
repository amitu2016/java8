package Java8.UnaryOperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo {
   public static void main(String[] args) {
     //Primitive version of UnaryOperator
    IntUnaryOperator o = i -> i * i;

    System.out.println(o.applyAsInt(23));
   }
}
