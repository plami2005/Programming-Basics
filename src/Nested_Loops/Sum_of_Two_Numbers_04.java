package Nested_Loops;

import java.util.Scanner;

public class Sum_of_Two_Numbers_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=Integer.parseInt(sc.nextLine());
        int e=Integer.parseInt(sc.nextLine());
        int m=Integer.parseInt(sc.nextLine());
        int k = 0;
        int sum = 0;
        for(int i=s;i<=e;i++){
            for(int j=s;j<=e;j++) {
                k++;
                sum = i + j;
                if (sum == m) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", k, i, j, m);
                    break;
                }
            }
                if(sum==m){
                    break;

                }
            }
        if(sum!=m){
            System.out.printf("%d combinations - neither equals %d",k,m);
        }
    }
}
