package ConditionalStatements;

import java.util.Scanner;

public class PasswordGuess_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String ps = "s3cr3t!P@ssw0rd";
        if (txt.equals(ps)){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
