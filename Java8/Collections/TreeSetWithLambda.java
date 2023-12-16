package Java8.Collections;

import java.util.TreeSet;

public class TreeSetWithLambda {
    public static void main(String[] args) {
        //Lambda Used For Customized Sorting
        TreeSet<Integer> t = new TreeSet<>((I1,I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
        t.add(10);
        t.add(0);
        t.add(12);
        t.add(2);
        t.add(5);
        t.add(3);
        t.add(0);
        System.out.println(t);
    }
}
