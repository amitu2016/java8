package Java8.Threads;

public class Demo1 {
    public static void main(String[] args) {
        Intref2 i = (a, b) -> System.out.println("Result is "+(a+b));
        i.add(10, 20);
    }
}
