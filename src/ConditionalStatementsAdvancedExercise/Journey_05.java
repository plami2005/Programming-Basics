package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String des = "";
        String ac = "";
        if(season.equals("summer")){
            ac = "Camp";
        }
        else{
            ac = "Hotel";
        }
        if(budget<=100){
            des = "Bulgaria";
            if (season.equals("summer")){
                budget = budget*0.30;
            }
            else if (season.equals("winter")){
                budget = budget*0.70;
            }
        }
        else if (budget>100&&budget<=1000){
            des = "Balkans";
            if(season.equals("summer")){
                budget = budget*0.40;
            }
            else if (season.equals("winter")){
                budget = budget*0.80;
            }
        }
        else{
            des = "Europe";
            ac = "Hotel";
            budget = budget*0.90;
        }
        System.out.printf("Somewhere in %s%n", des);
        System.out.printf("%s - %.2f", ac, budget);
    }
}
