package Java8.DateTimeApi;

import java.time.LocalDateTime;

public class DateAndTimeDemo3 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(1994, 1, 2, 8, 45);
        System.out.println(dt);
        System.out.println("After 6 months "+dt.plusMonths(6));
        System.out.println("Before 6 Months "+dt.minusMonths(6));
    }
}
