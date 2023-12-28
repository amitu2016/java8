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

public class WithConstructorReference {
    public static void main(String[] args) {
        //Using constructor reference instead of lambda expressions
        intref i = Sample::new;
        Sample s = i.m1();
        System.out.println(s);
    }
}
