package ForLoopsExercise;

import java.util.Scanner;

public class Half_Sum_Element_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            int cNum = Integer.parseInt(sc.nextLine());
            if(cNum>max){
                max=cNum;
            }
            sum+=cNum;
        }
        sum=sum-max;
        if(sum==max){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        }
        else{
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum-max));
        }
    }
}
