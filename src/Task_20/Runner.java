package Task_20;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        OnlineKitapMagazasi kitapMagazasi = new OnlineKitapMagazasi();
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("============ Online Kitap Mağazası ============");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Numarasıyla Kitap Sil");
            System.out.println("3. Tüm Kitapları Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminizi yapın (1-4): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    kitapMagazasi.kitapEkle();
                    break;
                case 2:
                    kitapMagazasi.kitapSil();
                    break;
                case 3:
                    kitapMagazasi.kitapListele();
                    break;
                case 4:
                    System.out.println("Program sonlandırılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.\n");
            }
        } while (secim != 4);
    }
}
