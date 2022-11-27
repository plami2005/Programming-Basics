package WhileLoopExercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w =Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());
        int size = w*l;
        int eat = 0;
        boolean left = false;
        String s = sc.nextLine();
        while(!s.equals("STOP")){
            int br = Integer.parseInt(s);
            eat+=br;
            if(eat>=size){
                left=true;
                break;
            }
            s=sc.nextLine();
        }
        if(left){
            int more = eat-size;
            System.out.printf("No more cake left! You need %d pieces more.",more);
        }
        else{
            int over = size-eat;
            System.out.printf("%d pieces are left.",over);
        }
    }
}
