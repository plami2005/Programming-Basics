package SoftUni_Exam;

import java.util.Scanner;

public class Unique_PIN_Codes_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());

        for (int i = 2; i <= first; i += 2)
        {
            for (int j = 2; j <= second; j++)
            {
                for (int k = 2; k <= third; k += 2)
                {
                    if (j == 2 || j== 3|| j == 5 || j == 7)
                    {
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
    }
}

