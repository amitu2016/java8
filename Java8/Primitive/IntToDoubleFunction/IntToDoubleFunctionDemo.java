package Java8.Primitive.IntToDoubleFunction;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionDemo {
   public static void main(String[] args) {
    //Accepts primitive integer and returns primitive double
     IntToDoubleFunction  f = i -> Math.sqrt(i);

     System.out.println(f.applyAsDouble(25));
   }
}
