package WhileLoop;

import java.util.Scanner;

public class Sum_numbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while (sum<a){
            int n = Integer.parseInt(sc.nextLine());
            sum += n;
        }
        System.out.println(sum);
    }
}
