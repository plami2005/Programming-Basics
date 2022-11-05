package FirstSteps;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int br = Integer.parseInt(sc.nextLine());
        int time = br * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, time, br);
    }
}
