package WhileLoopExercise;

import java.util.Scanner;

public class Old_Books_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count =0;
        boolean found = false;
        String tname =sc.nextLine();
        while (!tname.equals("No More Books")){
            if(tname.equals(name)){
                found=true;
                break;
            }
            count++;
            tname=sc.nextLine();
        }
        if (found){
            System.out.printf("You checked %d books and found it.", count);
        }
        else{
            System.out.printf("The book you search is not here!%nYou checked %d books.",count);
        }
    }
}
