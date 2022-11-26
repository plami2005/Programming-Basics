package WhileLoop;

import java.util.Scanner;

public class Max_number_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int max  = Integer.MIN_VALUE;
        while (!input.equals("Stop")){
            int currentNum  = Integer.parseInt(input);
            if(currentNum>max){
                max = currentNum;
            }
            input = sc.nextLine();
        }
        System.out.println(max);
    }
}
