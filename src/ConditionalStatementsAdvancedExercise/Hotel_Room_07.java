package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Hotel_Room_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        int br =Integer.parseInt(sc.nextLine());
        double st=0;
        double ap=0;
        double tst;
        double tap;
        switch (m){
            case "May":
            case "October":
                st=50;
                ap=65;
                if(br>7&&br<=14){
                    st-=st*0.05;
                }
                else if(br>14){
                    st -= st*0.3;
                    ap -= ap*0.1;
                }
                tap = ap*br;
                tst = st*br;
                System.out.printf("Apartment: %.2f lv.%n",tap);
                System.out.printf("Studio: %.2f lv.",tst);
                break;
            case "June":
            case  "September":
                st=75.20;
                ap=68.70;
                if(br>14){
                    st-=st*0.2;
                    ap-=ap*0.1;
                }
                tap = ap*br;
                tst = st*br;
                System.out.printf("Apartment: %.2f lv.%n",tap);
                System.out.printf("Studio: %.2f lv.",tst);
                break;
            case "July":
            case "August":
                st=76;
                ap=77;
                if(br>14){
                    ap-=ap*0.1;
                }
                 tap = ap*br;
                 tst = st*br;
                System.out.printf("Apartment: %.2f lv.%n",tap);
                System.out.printf("Studio: %.2f lv.",tst);
                break;
        }
    }
}
