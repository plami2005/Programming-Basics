package WhileLoop;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        String password =sc.nextLine();
        String inp =sc.nextLine();
        while (!inp.equals(password)){
            inp=sc.nextLine();
        }
        System.out.printf("Welcome %s!",name);
    }
}
