package FirstSteps;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fooddog = Integer.parseInt(sc.nextLine());
        int foodcat = Integer.parseInt(sc.nextLine());
        double cena = fooddog * 2.50 + foodcat * 4;
        System.out.println(cena + " lv.");
    }
}
