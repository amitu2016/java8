package Java8.DateTimeApi;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime time =LocalTime.now();

        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();

        System.out.println(h+" : "+m+" : "+s+" : "+n);
    }
}
