package Java8.StudentManagement;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentMgmtDemo {

     public static void populate(ArrayList<Student> student){
        student.add(new Student("Rohan", 72));
        student.add(new Student("Sohan", 68));
        student.add(new Student("Ajay", 81));
        student.add(new Student("Sujay", 34));
        student.add(new Student("Ravi", 44));
    }

    public static void main(String[] args) {
        //Define a predicate to show the students having marks > 60
        Predicate<Student> p = stu -> stu.getMarks() >= 60;

        //Define a function to calculate grade of student based on marks
        Function<Student, String> f = student -> (student.getMarks() >= 80) ? "A[Distinction]"
         : (student.getMarks() >= 60) ? "B[First Class]":
          (student.getMarks() >= 50) ? "C[Second Class]" :
          (student.getMarks() >= 35) ? "D[Third Class]":"E[Fail]";

        //Define Consumer to print student information
        Consumer<Student> c = stud -> {
                 System.out.println("Student Name : "+stud.getName());
                System.out.println("Student Marks : "+stud.getMarks());
                System.out.println("Student Grade : "+f.apply(stud));
                System.out.println("**********************************************");
        };

        ArrayList<Student> studList = new ArrayList<>();
        populate(studList);

        //Print all students with their grade
        System.out.println("Print all students with their grade");
        for(Student s : studList){
            c.accept(s);
         }
        System.out.println();

        //Print all students having marks >= 60
        System.out.println("Print all students having marks >= 60");
       for(Student stu : studList){
            if(p.test(stu)){
                c.accept(stu);
            }
       }
    }
}
