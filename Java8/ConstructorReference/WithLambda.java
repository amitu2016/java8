package Java8.ConstructorReference;

class Sample{
    Sample(){
        System.out.println("Sample Constructor Execution");
    }
}

@FunctionalInterface
interface intref {
    public Sample m1();
}

public class WithLambda {
   public static void main(String[] args) {
     intref i = () -> {
        Sample s = new Sample();
        return s;
    };

    Sample s1 = i.m1();
    System.out.println(s1);
   }
}
