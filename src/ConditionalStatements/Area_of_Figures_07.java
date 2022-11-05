package ConditionalStatements;

import java.util.Scanner;

public class Area_of_Figures_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vid = sc.nextLine();
        double area = 0.0;
        if (vid.equals("square")){
            double a = Double.parseDouble(sc.nextLine());
            area = a*a;
        }
        else if (vid.equals("rectangle")){
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            area = a*b;
        }
        else if (vid.equals("circle")){
            double r = Double.parseDouble(sc.nextLine());
            area = Math.PI*r*r;
        }
        else if (vid.equals("triangle")){
            double a = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            area = (a*h)/2;
        }
        System.out.printf("%.3f",area);


    }
}
