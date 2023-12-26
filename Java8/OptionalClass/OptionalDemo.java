package Java8.OptionalClass;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String str = null;
        Optional<String> nullableString = Optional.ofNullable(str);

        if (nullableString.isPresent()) {
            System.out.println(nullableString.get().length());
        } else {
            System.out.println(nullableString.orElse("Null String"));
        }
        
    }
}
