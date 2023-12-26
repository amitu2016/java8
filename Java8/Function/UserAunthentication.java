package Java8.Function;

import java.util.Scanner;
import java.util.function.Function;

public class UserAunthentication {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s.substring(0, 5);
        Function<String, String> f2 = s -> s.toLowerCase();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String user = sc.next();

        System.out.println("Enter Password: ");
        String pwd = sc.next();

        if (f1.andThen(f2).apply(user).equals("durga") && pwd.equals("java")) {
            System.out.println("Authentication Successful");
        } else {
             System.out.println("Authentication Failed");
        }

        sc.close();

    }
}
