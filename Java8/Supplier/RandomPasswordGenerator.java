package Java8.Supplier;

import java.util.function.Supplier;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        
    Supplier<String> pass = () -> {

        String pwd = "";
        Supplier<Integer> digit = () -> (int) (Math.random() * 10);

        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";

        Supplier<Character> ch = () -> symbols.charAt((int)(Math.random()*29));

        for(int i =0; i<8; i++){
            if (i%2==0) {
                pwd = pwd+digit.get();
            } else {
                pwd = pwd+ch.get();
            }
        }

        return pwd;
    };

        System.out.println(pass.get());
    }

    

}
