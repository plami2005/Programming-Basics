package WhileLoop;

import java.util.Scanner;

public class Sequence_2k1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int a = 1;
        while(a<=n){
            System.out.println(a);
            a=a*2+1;
        }
    }
}
