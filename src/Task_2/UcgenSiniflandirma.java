package Task_2;

import java.util.Scanner;

public class UcgenSiniflandirma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Üçgenin 1. kenar uzunluğunu girin: ");
        int a = oku.nextInt();
        System.out.print("Üçgenin 2. kenar uzunluğunu girin: ");
        int b = oku.nextInt();
        System.out.print("Üçgenin 3. kenar uzunluğunu girin: ");
        int c = oku.nextInt();

        if (((a + b) > c && (a - b) < c) && ((a + c) > b && (a - c) < b) && ((c + b) > a && (c - b) < a)) {

            if (a == b && a == c && b == c)
                System.out.println("Bu bir eşkenar üçgendir.");

            if (((a == b) && a != c) || ((a == c) && a != b) || ((b == c) && b != a) || ((b == a) && b != c) || ((c == a) && c != b) || ((c == b) && c != a))
                System.out.println("Bu bir ikizkenar üçgendir.");

            if (a != b && a != c && b != c)
                System.out.println("Bu bir çeşitkenar üçgendir");


        } else
            System.out.println("********** Geçersiz üçgen **********");


    }
}
