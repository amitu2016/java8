package Java8.Streams;

import java.util.stream.Stream;

public class Ofdemo {
    
    public static void main(String[] args) {
        //Stream of int values
        Stream<Integer> s = Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);

        Double[] d = {10.0, 12.0, 32.0, 19.0};
        //Stream for double array
        Stream<Double> ds = Stream.of(d);
        ds.forEach(System.out::println);
    }
}
