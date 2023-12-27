package Java8.BiFunction;

import java.util.function.BiFunction;

public class MonthlySalaryCalulator {

    public static void main(String[] args) {
    //Function to calculate monthy salary
    BiFunction<Employee, Timesheet, Double> f = (e,t) -> e.getDailyWage() * t.getDays();

    Employee emp = new Employee(101, "Amit", 2000.0);
    Timesheet t = new Timesheet(101, 22);

    System.out.println("Monthly salary : "+f.apply(emp, t));

    }

}
