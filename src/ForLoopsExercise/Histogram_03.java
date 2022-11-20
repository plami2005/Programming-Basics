package ForLoopsExercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for(int i=0; i<n; i++){
            int cNum = Integer.parseInt(sc.nextLine());
            if(cNum<200){
                p1++;
            }
            else if(cNum<=399){
                p2++;
            }
            else if(cNum<=599){
                p3++;
            }
            else if(cNum<=799){
                p4++;
            }
            else{
                p5++;
            }
        }
        System.out.printf("%.2f%%%n",p1*1.00/n*100);
        System.out.printf("%.2f%%%n",p2*1.00/n*100);
        System.out.printf("%.2f%%%n",p3*1.00/n*100);
        System.out.printf("%.2f%%%n",p4*1.00/n*100);
        System.out.printf("%.2f%%%n",p5*1.00/n*100);
    }
}
