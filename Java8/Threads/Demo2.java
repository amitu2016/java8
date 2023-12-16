package Java8.Threads;

public class Demo2 {
    public static void main(String[] args) {
        Intrf3 i = s -> s.length();
        System.out.println(i.getLength("Hello World"));
    }
}
