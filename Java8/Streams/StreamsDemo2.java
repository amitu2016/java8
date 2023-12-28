package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pavan");
        list.add("Shahrukh");
        list.add("Raviteja");
        list.add("Chiranjeevi");
        list.add("Venkatesh");
        list.add("Nagarjuna");

        //List of names having length > 9
        List<String> l = list.stream().filter(s -> s.length() >=9).collect(Collectors.toList());

        System.out.println(l);

        //List of Names mapped in upper case
        List<String> l2 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println(l2);

        //Find count of names having length >= 9
        long count = list.stream().filter(s -> s.length() >=9).count();

        System.out.println("count of names having length >= 9 : "+count);
    }
}
