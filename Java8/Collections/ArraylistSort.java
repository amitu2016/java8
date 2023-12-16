package Java8.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(0);
        l.add(5);
        l.add(8);
        l.add(3);
        l.add(21);
        System.out.println("Before: "+l);
        Collections.sort(l, new MyComparator());
        System.out.println("After: "+l);
    }
}
