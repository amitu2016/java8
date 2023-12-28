package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo1 {
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

        System.out.println("Original List "+i);

        //Stream to filter even numbers
        List<Integer> res = i.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println("Even List "+res);

        //Stream to double each integer
        List<Integer> res1 = i.stream().map(x -> x * 2).collect(Collectors.toList());

        System.out.println("List with Doubled Elements : "+res1);

    }
}
