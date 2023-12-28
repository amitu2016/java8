package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
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

        //Sort the list by default natural sorting order
        List<Integer> sorted = i.stream().sorted().collect(Collectors.toList());
        System.out.println("Default sorting order : "+sorted);

        //Sort the list in decreasing order
        //For decreasing order either we can make i1 negative or intercahnge the positions of i1 and i2
        List<Integer> dec = i.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Decreasing order : "+dec);

    }
}
