package Java8.Anonymous;

class AnonymousDemo1 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread "+i);
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int index = 0; index < 10; index++) {
            System.out.println("Main Thread "+index);
        }
    }
    
}