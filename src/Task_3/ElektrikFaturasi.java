package Task_3;

import java.util.Scanner;

public class ElektrikFaturasi {
    public static void main(String[] args) {
        Scanner okuInt = new Scanner(System.in);

        System.out.print("Yeni okuma değerini girin: ");
        int yeni_okuma = okuInt.nextInt();
        System.out.print("Eski okuma değerini girin: ");
        int eski_okuma = okuInt.nextInt();

        float birim_fiyat=0;
        int elektrik_tüketimi = yeni_okuma - eski_okuma;

        if (elektrik_tüketimi >= 0 && elektrik_tüketimi <= 100)
            birim_fiyat = 1.1f;
        if (elektrik_tüketimi >= 101 && elektrik_tüketimi <= 200)
            birim_fiyat = 1.3f;
        if (elektrik_tüketimi >= 201 && elektrik_tüketimi <= 300)
            birim_fiyat = 1.5f;
        if (elektrik_tüketimi >= 301 && elektrik_tüketimi <= 400)
            birim_fiyat = 1.7f;
        if (elektrik_tüketimi >= 401 && elektrik_tüketimi <= 500)
            birim_fiyat = 1.9f;
        if (elektrik_tüketimi >= 501)
            birim_fiyat = 2.3f;

        float aylik_fatura = elektrik_tüketimi * birim_fiyat;
        System.out.println("Aylık fatura = " + aylik_fatura);

    }
}
