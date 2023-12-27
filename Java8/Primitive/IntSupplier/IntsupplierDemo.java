package Java8.Primitive.IntSupplier;

import java.util.function.IntSupplier;

public class IntsupplierDemo {
    public static void main(String[] args) {
        IntSupplier s = () -> (int)(Math.random()*10);
        String otp = "";
        for(int i = 0; i < 6; i++){
            otp = otp + s.getAsInt();
        }

        System.out.println(otp);
    }
}
