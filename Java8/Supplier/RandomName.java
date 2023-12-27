package Java8.Supplier;

import java.util.function.Supplier;

public class RandomName {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String[] arr = {"Akash", "Sukash", "Chinny", "Bunny", "Vinni"};
            int x = (int) (Math.random() * 4);
            return arr[x];
        };

        System.out.println(s.get());
    }
}
