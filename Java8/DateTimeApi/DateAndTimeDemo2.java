package Java8.DateTimeApi;

import java.time.LocalDate;

public class DateAndTimeDemo2 {
   public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    int dd = date.getDayOfMonth();
    int mm = date.getMonthValue();
    int yyyy = date.getYear();

    System.out.println(dd+"/"+mm+"/"+yyyy);
   } 
}
