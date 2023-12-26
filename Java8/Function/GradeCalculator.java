package Java8.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeCalculator {
    
    public static void populate(ArrayList<Student> student){
        student.add(new Student("Rohan", 72));
        student.add(new Student("Sohan", 68));
        student.add(new Student("Ajay", 81));
        student.add(new Student("Sujay", 34));
        student.add(new Student("Ravi", 44));
    }


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        populate(students);

        //Function to take student and return grades
        Function<Student, String> f = student -> (student.getMarks() >= 80) ? "Distinction"
         : (student.getMarks() >= 60) ? "First Class":
          (student.getMarks() >= 50) ? "Second Class" :
          (student.getMarks() >= 35) ? "Third Class":"Fail";

          for(Student stu : students){
            System.out.println("Student Name : "+stu.getName()+", Grade: "+f.apply(stu));
          }

        //Predicate to check students having marks greater than 60
        Predicate<Student> p = stud -> stud.getMarks() > 60;
        System.out.println("Students having marks > 60");
        for(Student stu: students){
            if (p.test(stu)) {
                System.out.println(stu.getName());
            }
        }

    }

}
