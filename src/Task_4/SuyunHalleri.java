package Task_4;

import java.util.Scanner;

public class SuyunHalleri {
    public static void main(String[] args) {
        Scanner okuInt = new Scanner(System.in);

        System.out.print("Su sıcaklığını giriniz: ");
        int su_sicakligi = okuInt.nextInt();

        if (su_sicakligi <= 0)
            System.out.println("Su katı haldedir");
        else if (su_sicakligi >= 1 && su_sicakligi <= 100)
            System.out.println("Su sıvı haldedir.");
        else
            System.out.println("Su gaz halindedir.");

    }
}
