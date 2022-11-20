package ForLoopsExercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int salary =Integer.parseInt(sc.nextLine());
        int f = 0;
        for (int i=0; i<n; i++){
            String cTab = sc.nextLine();
            switch (cTab){
                case "Facebook":
                    f+=150;
                    break;
                case "Instagram":
                    f+=100;
                    break;
                case "Reddit":
                    f+=50;
                    break;
            }
            if(f>=salary){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if(salary>f){
            int left = salary-f;
            System.out.println(left);
        }
    }
    }

