package Java8.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class StudentDemo {
    public static void main(String[] args) {
        //Bifunction to take name and marks as argument and create student object
        BiFunction<String, Integer, Student> f = (name, marks) -> new Student(name, marks);

        ArrayList<Student> students = new ArrayList<>();
        students.add(f.apply("Amit", 80));
        students.add(f.apply("Chinny", 65));
        students.add(f.apply("Bunny", 37));
        students.add(f.apply("Vinny", 73));

        System.out.println(students);

    }
}
