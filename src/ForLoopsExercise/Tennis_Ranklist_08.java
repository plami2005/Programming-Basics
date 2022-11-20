package ForLoopsExercise;

import java.util.Scanner;

public class Tennis_Ranklist_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int stpoints = Integer.parseInt(sc.nextLine());
        int tpoints= stpoints;
        int win =0;
        for(int i=0;i<t;i++){
            String type =sc.nextLine();
            switch (type){
                case "W":
                    tpoints+=2000;
                    win++;
                    break;
                case "F":
                    tpoints+=1200;
                    break;
                case "SF":
                    tpoints+=720;
                    break;
            }
        }
        double average = (tpoints-stpoints)/t;
        double w = (double)win/t*100;
        System.out.printf("Final points: %d%n", tpoints);
        System.out.printf("Average points: %.0f%n",Math.floor(average));
        System.out.printf("%.2f%%",w);
    }
}
