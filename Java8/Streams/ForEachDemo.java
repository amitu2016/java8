package Java8.Streams;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Adasf");
        list.add("ghjj");
        list.add("dffre");
        list.add("vcfdg");
        list.add("rtrreh");

        list.stream().forEach(s -> System.out.println(s));

        //Using method reference instead of lambda expression
        list.stream().forEach(System.out::println);
    }
}
