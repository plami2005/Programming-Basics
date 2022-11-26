package WhileLoop;

import java.util.Scanner;

public class Read_text_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        while (!inp.equals("Stop")){
            System.out.println(inp);
            inp = sc.nextLine();
        }
    }
}
