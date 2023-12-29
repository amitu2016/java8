package Java8.DateTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1994,1,2);
        LocalDate today = LocalDate.now();

        Period p = Period.between(birthDate, today);
        
        System.out.println("Your Age is "+p.getYears()+" years " +p.getMonths()+" months "+p.getDays()+" days");

        LocalDate deathDate = LocalDate.of(1994+60,1,2);

        Period p2 = Period.between(today, deathDate);

        int days = p2.getYears()*365+p2.getMonths()*30+p2.getDays();

        System.out.println("You will be on earth for "+days+" days more");
    }
}
