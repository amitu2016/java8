package Java8.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeDemo {

    public static void populate(ArrayList<Employee> empList){
        empList.add(new Employee("Durga", 30000));
        empList.add(new Employee("Sunny",  20000));
        empList.add(new Employee("Mallika", 20000));
        empList.add(new Employee("Katrina",15000));
        empList.add(new Employee("Anushka",15000));
        empList.add(new Employee("Kanushka", 10000));
        empList.add(new Employee("Soumya", 10000));
        empList.add(new Employee("Ramya", 10000));
    }


    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        populate(empList);

        //Function to find total salary of All employees
        Function<ArrayList<Employee>, Double> f = list -> {
            double sum = 0;
            for(Employee emp : list){
                sum = sum + emp.getSalary();
            }
            return sum;
        };

        System.out.println("Total Salary is : "+f.apply(empList));

        //Function to give increment of 1299 to employees having salary less than 20000
        System.out.println("List Before increment "+empList);
        Predicate<Employee> p  = e -> e.getSalary() < 20000;
        Function<ArrayList<Employee>, ArrayList<Employee>> f2 = list -> {
            for(Employee empl: list){
                if (p.test(empl)) {
                    empl.setSalary(empl.getSalary()+1299);
                }
            }
            return list;
        };
        System.out.println("********************************************************");
         System.out.println("List After increment "+f2.apply(empList));
    }
}
