package Nested_LoopsExercise;

import java.util.Scanner;

public class Equal_Sums_Even_Odd_Position_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        for(int i = first;i<=second;i++){
            String cur = "" + i ;
            int odd = 0;
            int even = 0;
            for(int j = 0;j<cur.length();j++){
                int curd = Integer.parseInt("" + cur.charAt(j));
                if (j % 2 ==0){
                    even += curd;
                }
                else{
                    odd += curd;
                }
            }
            if (odd == even){
                System.out.print(i + " ");
            }
        }
    }
}
