package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Personal_Titles_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = Double.parseDouble(sc.nextLine());
        String g = sc.nextLine();
        if (g.equals("f")){
            if(age<16){
                System.out.println("Miss");
            }
            else{
                System.out.println("Ms.");
            }
        }
        if (g.equals("m")){
            if(age<16){
                System.out.println("Master");
            }
            else{
                System.out.println("Mr.");
            }
        }
    }
}
