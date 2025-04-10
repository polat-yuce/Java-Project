package Task_20;

import java.util.ArrayList;
import java.util.Scanner;

class OnlineKitapMagazasi {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void kitapEkle() {

        System.out.print("Kitap Adı: ");
        String kitapAdi = scanner.nextLine();
        System.out.print("Yazar Adı: ");
        String yazarAdi = scanner.nextLine();
        System.out.print("Yayın Yılı: ");
        int yayinYili = scanner.nextInt();
        System.out.print("Fiyat: ");
        double fiyat = scanner.nextDouble();

        Kitap yeniKitap = new Kitap(kitapAdi, yazarAdi, yayinYili, fiyat);
        kitapListesi.add(yeniKitap);
        System.out.println("Kitap başarıyla eklendi.\n");
    }

    public void kitapSil() {
        System.out.print("Silmek istediğiniz kitabın numarasını girin: ");
        int kitapNumarasi = scanner.nextInt();

        boolean kitapVarMi = false;
        for (Kitap kitap : kitapListesi) {
            if (kitap.getKitapNumarasi() == kitapNumarasi) {
                kitapListesi.remove(kitap);
                kitapVarMi = true;
                System.out.println("Kitap başarıyla silindi.\n");
                break;
            }
        }

        if (!kitapVarMi) {
            System.out.println("Belirtilen numarada bir kitap bulunamadı.\n");
        }
    }

    public void kitapListele() {
        if (kitapListesi.isEmpty()) {
            System.out.println("Henüz kitap eklenmemiş.\n");
        } else {
            for (Kitap kitap : kitapListesi) {
                System.out.println(kitap.toString());
            }
        }
    }
}
