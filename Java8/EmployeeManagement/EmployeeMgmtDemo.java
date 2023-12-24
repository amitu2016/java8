package Java8.EmployeeManagement;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeMgmtDemo {
    
    public static void populate(ArrayList<Employee> empList){
        empList.add(new Employee("Durga", "CEO", 30000, "Mumbai"));
        empList.add(new Employee("Sunny", "Manager", 20000, "Banglore"));
        empList.add(new Employee("Mallika", "Manager", 20000, "Mumbai"));
        empList.add(new Employee("Katrina", "Lead", 15000, "Banglore"));
        empList.add(new Employee("Anushka", "Lead", 15000, "Hydrabad"));
        empList.add(new Employee("Kanushka", "Developer", 10000, "Hydrabad"));
        empList.add(new Employee("Soumya", "Developer", 10000, "Hydrabad"));
        empList.add(new Employee("Ramya", "Developer", 10000, "Banglore"));
    }

     private static void display(ArrayList<Employee> empList, Predicate<Employee> p) {
        for(Employee e : empList){
            if (p.test(e)) {
                System.out.println(e);
            }
        }
        System.out.println("**************************************************");
    }

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        populate(empList);
        
        //Find Employees whose designation is manager
        Predicate<Employee> p = emp -> emp.getDesignation().equals("Manager");
        System.out.println("Employees whose designation is manager are : ");
        display(empList, p);

        //Find Employees whose city is Banglore
        Predicate<Employee> p1 = emp -> emp.getCity().equals("Banglore");
        System.out.println("Employees who are from Banglore are :");
        display(empList, p1);

        //Find Employees whose salary is less than 20000
        Predicate<Employee> p2 = emp -> emp.getSalary() < 20000;
        System.out.println("Employees with salary less than 20000 are :");
        display(empList, p2);

        //Find Employees who are managers from Banglore
        System.out.println("Employees who are managers from Banglore");
        display(empList, p.and(p1));
        
        //Find Employess who are managers or whose salary less than 20000
        System.out.println("Employess who are managers or whose salary less than 20000 :");
        display(empList, p.or(p2));

        //Find all employees who are not managers
        System.out.println("All employees who are not managers are :");
        display(empList, p.negate());

        //Find Is the employee CEO by using isEqual method of Predicate
        Predicate<Employee> isCeo = Predicate.isEqual(new Employee("Durga", "CEO", 30000, "Mumbai"));
        Employee e1 = new Employee("Durga", "CEO", 30000, "Mumbai");
        Employee e2 = new Employee("Sunny", "Manager", 20000, "Banglore");

        System.out.println(isCeo.test(e1));
        System.out.println(isCeo.test(e2));

    }
}
