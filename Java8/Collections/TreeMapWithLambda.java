package Java8.Collections;

import java.util.TreeMap;

public class TreeMapWithLambda {
    public static void main(String[] args) {
        //Using Lambda Expressions, reverse sorting
        TreeMap<Integer, String> map = new TreeMap<>((I1,I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
        map.put(200, "asd");
        map.put(600, "sfa");
        map.put(300, "sed");
        map.put(100, "gnh");
        map.put(500, "cds");
        map.put(700, "uhf");
        map.put(400, "mhg");
        System.out.println(map);
    }
}
