package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Operations_Between_Numbers_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        double res;
        String eo;
        switch (operator){
            case "+":
                res = n1+n2;
                if (res%2==0){
                    eo="even";
                }
                else{
                    eo="odd";
                }
                System.out.printf("%d + %d = %.0f - %s",n1,n2,res,eo);
                break;
            case "-":
                res = n1-n2;
                if (res%2==0){
                    eo="even";
                }
                else{
                    eo="odd";
                }
                System.out.printf("%d - %d = %.0f - %s",n1,n2,res,eo);
                break;
            case "*":
                res = n1*n2;
                if (res%2==0){
                    eo="even";
                }
                else{
                    eo="odd";
                }
                System.out.printf("%d * %d = %.0f - %s",n1,n2,res,eo);
                break;
            case "/":
                if (n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                else{
                   res=(double)n1/n2;
                   System.out.printf("%d / %d = %.2f",n1,n2,res);
                }
                break;
            case "%":
                if (n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                else{
                    res=n1%n2;
                    System.out.printf("%d %% %d = %.0f",n1,n2,res);
                }
                break;
        }

    }
}
