package Java8.Anonymous;

public class AnonymousDemo2 {
    public static void main(String[] args) {
        // Use lambda directly
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child "+i);
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main "+i);
        }
    }
}
