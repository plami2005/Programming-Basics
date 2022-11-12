package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Fruit_or_Vegetable_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        switch (name){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");break;
            default:
                System.out.println("unknown");break;
        }
    }
}
