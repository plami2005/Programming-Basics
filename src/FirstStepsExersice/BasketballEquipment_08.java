package FirstStepsExersice;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gtaksa =Integer.parseInt(sc.nextLine());
        double kec = gtaksa - gtaksa*0.4;
        double ekip = kec - kec*0.2;
        double topka = ekip/4;
        double aks = topka/5;
        double sum = gtaksa + kec + ekip + topka + aks;
        System.out.println(sum);
    }
}
