package WhileLoop;

import java.util.Scanner;

public class Account_balance_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s =sc.nextLine();
       double sum = 0;
       while (!s.equals("NoMoreMoney")){
           double csum =Double.parseDouble(s);
           if(csum<0){
               System.out.println("Invalid operation!");
               break;
           }
           System.out.printf("Increase: %.2f%n",csum);
           sum+=csum;
           s = sc.nextLine();
       }
       System.out.printf("Total: %.2f",sum);
    }
}
