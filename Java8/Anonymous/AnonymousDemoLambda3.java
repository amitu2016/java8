package Java8.Anonymous;

@FunctionalInterface
interface inref {
    public void m1();
}

public class AnonymousDemoLambda3 {
    
    int x = 7777;

    public void m2(){
        inref i = () -> {
            int x = 8888;
            System.out.println(this.x);
            System.out.println(x);
        };
        i.m1();
    }

    public static void main(String[] args) {
        AnonymousDemoLambda3 o = new AnonymousDemoLambda3();
        o.m2();
    }

}
