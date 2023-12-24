package Java8.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User {

    private String uname;
    private String pwd;
    
    public User(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
    
}



public class UserAuthenticationDemo {

    public static void main(String[] args) {
        Predicate<User> auth = u -> u.getUname().equals("amit") && u.getPwd().equals("java");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        String uname = sc.next();

        System.out.println("Enter Password:");
        String pass = sc.next();

        User user = new User(uname, pass);

        if (auth.test(user)) {
            System.out.println("User Aunthentication Successfull");
        } else {
            System.out.println("User Authentication Failed!!");
        }

        sc.close();
    }
    

}
