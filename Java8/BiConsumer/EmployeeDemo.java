package Java8.BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        BiFunction<String, Double, Employee> f = (name,salary) -> new Employee(name, salary);

        empList.add(f.apply("Chinny", 2000.0));
        empList.add(f.apply("Binny", 1300.0));
        empList.add(f.apply("Vinny", 2100.0));
        empList.add(f.apply("Durga", 1100.0));

        BiConsumer<Employee, Double> c = (e,i) ->e.setSalary(e.getSalary()+i);

        for(Employee emp: empList){
            c.accept(emp, 500.0);
        }

        System.out.println(empList);
    }
}
