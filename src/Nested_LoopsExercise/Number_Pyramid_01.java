package Nested_LoopsExercise;

import java.util.Scanner;

public class Number_Pyramid_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int cur = 1;
        boolean big = false;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(cur>n){
                    big=true;
                    break;
                }
                System.out.print(cur + " ");
                cur++;
            }
            if(big){
                break;
            }
            System.out.println();
        }
    }
}
