package Java8.BinaryOperator;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorDemo {
    public static void main(String[] args) {
        //Primitive version of BianryOperator
        IntBinaryOperator o = (i1,i2) -> i1 + i2;

        System.out.println(o.applyAsInt(10, 20));
    }
}
