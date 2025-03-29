package Task_1;

import java.util.Scanner;

public class DepremOlcegi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        //Kullanıcıdan deprem büyüklüğü (magnitude) girişi alınacak.
        System.out.print("Deprem büyüklüğü (magnitude) giriniz : ");
        double magnitude = oku.nextDouble();

        //Girilen büyüklük değeri, Richter ölçeğindeki aralıklara göre kontrol edilecek.

        if (magnitude < 2.0)
            System.out.println("Deprem tanımlayıcı: Micro - Mikro");

        else if (2.0 >= magnitude || magnitude < 3.0)
            System.out.println("Deprem tanımlayıcı: Very minor - Çok küçük");

        else if (3.0 >= magnitude || magnitude < 4.0)
            System.out.println("Deprem tanımlayıcı: Minor - Küçük");

        else if (4.0 >= magnitude || magnitude < 5.0)
            System.out.println("Deprem tanımlayıcı: Light - Hafif");

        else if (5.0 >= magnitude || magnitude < 6.0)
            System.out.println("Deprem tanımlayıcı: Moderate - Orta");

        else if (6.0 >= magnitude || magnitude < 7.0)
            System.out.println("Deprem tanımlayıcı: Strong - Ağır");

        else if (7.0 >= magnitude || magnitude < 8.0)
            System.out.println("Deprem tanımlayıcı: Major - Büyük");

        else if (8.0 >= magnitude || magnitude < 10.0)
            System.out.println("Deprem tanımlayıcı: Great - Çok Büyük");

        else if (magnitude == 10 || magnitude > 10)
            System.out.println("Deprem tanımlayıcı: Meteoric - Meteorik");


    }
}
