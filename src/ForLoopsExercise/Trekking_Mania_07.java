package ForLoopsExercise;

import java.util.Scanner;

public class Trekking_Mania_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g =Integer.parseInt(sc.nextLine());
        int tpeople = 0;
        int musala=0;
        int montblanc=0;
        int kilimanjaro=0;
        int k2=0;
        int everest=0;
        for(int i=0;i<g;i++){
            int cg = Integer.parseInt(sc.nextLine());
            tpeople+=cg;
            if(cg<=5){
                musala+=cg;
            }
            else if (cg<=12){
                montblanc+=cg;
            }
            else if (cg<=25){
                kilimanjaro+=cg;
            }
            else if (cg<=40){
                k2+=cg;
            }
            else{
                everest+=cg;
            }
        }
        System.out.printf("%.2f%%%n",(double)musala/tpeople*100);
        System.out.printf("%.2f%%%n",(double)montblanc/tpeople*100);
        System.out.printf("%.2f%%%n",(double)kilimanjaro/tpeople*100);
        System.out.printf("%.2f%%%n",(double)k2/tpeople*100);
        System.out.printf("%.2f%%%n",(double)everest/tpeople*100);

    }
}
