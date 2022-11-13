package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Summer_Outfit_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = Integer.parseInt(sc.nextLine());
        String d = sc.nextLine();
        String o = "";
        String s = "";
        switch (d){
            case "Morning":
                if(g>=10&&g<=18){
                    o = "Sweatshirt";
                    s = "Sneakers";
                }
                else if (g>18&&g<=24){
                    o = "Shirt";
                    s = "Moccasins";
                }
                else if (g>=25){
                    o = "T-Shirt";
                    s = "Sandals";
                }
                else System.out.println("error");
                System.out.printf("It's %d degrees, get your %s and %s.", g, o, s);break;
            case "Afternoon":
                if(g>=10&&g<=18){
                    o = "Shirt";
                    s = "Moccasins";
                }
                else if (g>18&&g<=24){
                    o = "T-Shirt";
                    s = "Sandals";
                }
                else if (g>=25){
                    o = "Swim Suit";
                    s = "Barefoot";
                }
                else System.out.println("error");
                System.out.printf("It's %d degrees, get your %s and %s.", g, o, s);break;
            case "Evening":
                if(g>=10&&g<=18){
                    o = "Shirt";
                    s = "Moccasins";
                }
                else if (g>18&&g<=24){
                    o = "Shirt";
                    s = "Moccasins";
                }
                else if (g>=25){
                    o = "Shirt";
                    s = "Moccasins";
                }
                else System.out.println("error");
                System.out.printf("It's %d degrees, get your %s and %s.", g, o, s);break;
        }
    }
}
