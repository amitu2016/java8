package Java8.BiFunction;

public class Employee {
    private int eno;
    private String name;
    private double dailyWage;
    
    public Employee(int eno, String name, double dailyWage) {
        this.eno = eno;
        this.name = name;
        this.dailyWage = dailyWage;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    @Override
    public String toString() {
        return "Employee [eno=" + eno + ", name=" + name + ", dailyWage=" + dailyWage + "]";
    }

    

}
