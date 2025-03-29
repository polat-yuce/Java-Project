package Task_5;

import java.util.Scanner;

public class MaasHesabi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        float toplam_maaş;
        float prim;
        float prim_oranı;

        System.out.print("Sabit maaşı girin: ");
        float sabit_maaş = oku.nextFloat();

        System.out.print("Satışlardan elde edilen toplam kazancı girin: ");
        float satış_kazancı=oku.nextFloat();

        System.out.print("Belirlenen performans seviyesini (toplam kazanç hedefini girim): ");
        float performans_seviyesi=oku.nextFloat();

        if (satış_kazancı > performans_seviyesi) {
            prim_oranı = 0.10F;
        } else {
            prim_oranı = 0.05F;
        }

        prim = satış_kazancı * prim_oranı;
        toplam_maaş = sabit_maaş + prim;

        System.out.print("toplam_maaş = " + toplam_maaş);


    }
}
