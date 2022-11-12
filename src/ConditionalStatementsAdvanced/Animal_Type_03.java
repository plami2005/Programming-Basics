package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Animal_Type_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch (s){
            case "dog" : System.out.println("mammal");break;
            case "crocodile" :
            case "tortoise" :
            case "snake" :
                System.out.println("reptile");break;
            default: System.out.println("unknown");break;
        }
    }
}
