package Java8.DateTimeApi;

import java.time.Year;

public class LeapYearTest {
    public static void main(String[] args) {
        Year y = Year.of(2000);
        if (y.isLeap()) {
            System.out.println("Leap Year");
        } else {
           System.out.println("Not Leap Year"); 
        }
    }
}
