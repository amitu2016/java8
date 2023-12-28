package Java8.Threads;

public class ThreadDemo2 {

    public void m1(){
        for (int index = 0; index < 10; index++) {
            System.out.println("Child Thread "+index);
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 td = new ThreadDemo2();
        //Creating thread using method reference
        Runnable r = td::m1;

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread "+i);
        }

    }
}
