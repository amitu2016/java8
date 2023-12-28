package Java8.Streams;

import java.util.ArrayList;

public class MinDemo {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(10);
        i.add(31);
        i.add(28);
        i.add(17);
        i.add(14);
        i.add(32);
        i.add(33);
        i.add(50);
        i.add(81);
        i.add(39);

        Integer min = i.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println("Minimum element : "+min);
    }
}
