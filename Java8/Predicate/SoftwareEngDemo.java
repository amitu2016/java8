package Java8.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class SoftwareEngineer{
    private String name;
    private int age;
    private boolean isHavingGf;
    public SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isHavingGf() {
        return isHavingGf;
    }
    public void setHavingGf(boolean isHavingGf) {
        this.isHavingGf = isHavingGf;
    }

    @Override
    public String toString() {
        return name;
    }
   
}

public class SoftwareEngDemo {
    public static void main(String[] args) {
        List<SoftwareEngineer> list = new ArrayList<>();
        list.add(new SoftwareEngineer("Sunil", 60, false));
        list.add(new SoftwareEngineer("Sahrukh", 26, true));
        list.add(new SoftwareEngineer("Amit", 21, false));
        list.add(new SoftwareEngineer("Onkar", 23, true));
        list.add(new SoftwareEngineer("Abhishek", 17, true));

        Predicate<SoftwareEngineer> allowed = se -> se.getAge() > 18 && se.isHavingGf();
        System.out.println("Allowed Software Engineers are :");
        for(SoftwareEngineer s : list){
            if(allowed.test(s)){
                System.out.println(s);
            }
        }
    }
}
