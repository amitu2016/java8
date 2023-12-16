package Java8.Anonymous;

public class AnanomousLambda {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread "+i);
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        for (int index = 0; index < 10; index++) {
            System.out.println("Main Thread "+index);
        }
    }
}
