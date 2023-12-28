package Java8.Streams;

import java.util.ArrayList;

public class ToArrayDemo {
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

        //Convert List to array
        Integer[] arr = i.stream().toArray(Integer[] :: new);

        for(Integer x : arr){
            System.out.println(x);
        }

    }
}
