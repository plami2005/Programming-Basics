package Nested_LoopsExercise;

import java.util.Scanner;

public class Sum_Prime_Non_Prime_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumPrime=0;
        int sumNon=0;
        String inp = sc.nextLine();
        while(!inp.equals("stop")){
            int count=0;
            int cur = Integer.parseInt(inp);
            if(cur<0){
                System.out.printf("Number is negative.%n");
                inp=sc.nextLine();
                continue;
            }
            for(int i=1; i<=cur;i++){
                if(cur%i==0){
                    count++;
                }
            }
            if(count==2){
                sumPrime+=cur;
            }
            else{
                sumNon+=cur;
            }
            inp = sc.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d",sumNon);
    }
}
