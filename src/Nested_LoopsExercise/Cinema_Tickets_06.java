package Nested_LoopsExercise;

import java.util.Scanner;

public class Cinema_Tickets_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String inp = sc.nextLine();
       int count = 0;
       int counts = 0;
       int countk = 0;
       int countstud = 0;
       while (!inp.equals("Finish")){
           int countm = 0;
           String movie = inp;
           int n =Integer.parseInt(sc.nextLine());
           String ticket = sc.nextLine();
           while (!ticket.equals("End")){
               count++;
               countm++;
               switch (ticket){
                   case "standard":
                       counts++;
                       break;
                   case "kid":
                       countk++;
                       break;
                   case "student":
                       countstud++;
                       break;
               }
               if(countm>=n){
                   break;
               }
               ticket=sc.nextLine();
           }
           System.out.printf("%s - %.2f%% full.%n",movie,(double)countm/n*100);
           inp=sc.nextLine();
       }
        System.out.printf("Total tickets: %d%n",count);
        System.out.printf("%.2f%% student tickets.%n",(double)countstud/count*100);
        System.out.printf("%.2f%% standard tickets.%n",(double)counts/count*100);
        System.out.printf("%.2f%% kids tickets.%n",(double)countk/count*100);

    }
}
