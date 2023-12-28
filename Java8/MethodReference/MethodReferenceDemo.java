package Java8.MethodReference;

interface interf {
    public void m1();
}

public class MethodReferenceDemo {

    public static  void m2(){
        System.out.println("Method Reference");
    }

    public static void main(String[] args) {
        interf i = MethodReferenceDemo::m2;
        i.m1();
    }
}
