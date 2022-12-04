package Nested_LoopsExercise;

import java.util.Scanner;

public class Special_Numbers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1;i<=9;i++){
            for (int j = 1;j<=9;j++){
                for(int k = 1;k<=9;k++){
                    for(int p = 1;p<=9;p++){
                        if (n%i==0&&n%j==0&&n%k==0&&n%p==0){
                            System.out.printf("%d%d%d%d ",i,j,k,p);
                        }
                    }
                }
            }
        }
    }
}
