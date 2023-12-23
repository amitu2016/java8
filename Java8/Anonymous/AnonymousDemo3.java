package Java8.Anonymous;

/**
 * AnonymousDemo3
 */
@FunctionalInterface
interface intref {
 public void m1();
 }



public class AnonymousDemo3 {

    int x = 8888;

    public void m2(){

     intref i = new intref() {
        int x = 9999;
        @Override
        public void m1() {
           System.out.println("x = "+this.x);
        }
        
     };

     i.m1();

    }
    public static void main(String[] args) {
        AnonymousDemo3 test = new AnonymousDemo3();
        test.m2();
    }
   
}