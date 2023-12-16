package Java8.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(12, "ABC"));
        list.add(new Employee(5, "DEF"));
        list.add(new Employee(3, "GHI"));
        list.add(new Employee(15, "IJK"));
        list.add(new Employee(6, "LMN"));
        //Using Lambda Expressions to sort in decending order
        Collections.sort(list,(e1,e2) -> (e1.getEno() > e2.getEno() ? -1 : e1.getEno() < e2.getEno() ? 1 : 0));
        System.out.println(list);
    }
}
