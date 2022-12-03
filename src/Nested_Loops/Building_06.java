package Nested_Loops;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int et = Integer.parseInt(sc.nextLine());
        int br = Integer.parseInt(sc.nextLine());
        for (int i =et;i>=1;i--){
            for(int j = 0;j<br;j++){
                if(i==et){
                    System.out.printf("L%d%d ",i,j);
                }
                else if(i%2==0){
                    System.out.printf("O%d%d ",i,j);
                }
                else if(i%2!=0){
                    System.out.printf("A%d%d ",i,j);
                }
            }System.out.println();
        }
    }
}
