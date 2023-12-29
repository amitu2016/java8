package Java8.DateTimeApi;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yyyy = dt.getYear();

        System.out.println(dd+"/"+mm+"/"+yyyy);

        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();
        int n = dt.getNano();

        System.out.println(h+":"+m+":"+s+":"+n);
    }
}
