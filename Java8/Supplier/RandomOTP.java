package Java8.Supplier;

import java.util.function.Supplier;

public class RandomOTP {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String str = "";
            for (int i = 0; i < 6; i++) {
                str = str + (int)(Math.random() * 10);
            }
            return str;
        };
        System.out.println(s.get());
    }
}
