package Task_14;

import java.util.Scanner;
public class InternetFaturasi {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (islemeDevamMi(scanner)) {
                float aylikFatura = faturaHesapla(scanner);
                System.out.println("Aylık Internet Faturası2: = " +yuvarlama(aylikFatura)+" TL");
            }
            System.out.println("Program sonlandırıldı.");
            scanner.close();
        }
        public static boolean islemeDevamMi(Scanner scanner) {
            System.out.println("Yeni bir müşteri için hesaplama yapmak ister misiniz? (Evet için 'E', Hayır için 'H'): ");
            String cevap = scanner.next();
            return cevap.equalsIgnoreCase("E");
        }

        public static float faturaHesapla(Scanner scanner) {
            float aylikFatura;
            float aylikSabitUcret;
            float ekstraUcret;
            float ekUcretBirimFiyati = 0.0f; // Başlangıç değeri atandı

            System.out.print("Aylık sabit ücreti girin: ");
            aylikSabitUcret = scanner.nextFloat();

            System.out.print("Kategori (1, 2 veya 3) girin: ");
            int kategori = scanner.nextInt();

            System.out.print("Fazla kullanım miktarını (GB) girin: ");
            int fazlaKullanimMiktariGB = scanner.nextInt();

            // 3.1. Ekstra ücret birim fiyatını belirle
            if (kategori == 1) {
                ekUcretBirimFiyati = 0.10f;
            } else if (kategori == 2) {
                ekUcretBirimFiyati = 0.20f;
            } else if (kategori == 3) {
                ekUcretBirimFiyati = 0.30f;
            } else {
                System.out.println("Geçersiz kategori! Program sonlandırıldı.");
                System.exit(0);
            }

            // 3.2. Ekstra ücreti hesapla
            ekstraUcret = fazlaKullanimMiktariGB * ekUcretBirimFiyati;

            // 3.3. Toplam aylık faturayı hesapla
            aylikFatura = aylikSabitUcret + ekstraUcret;

            return aylikFatura;
        }
    // İki ondalık basamağa yuvarlama işlemi için ayrı bir yardımcı fonksiyon
      public static float yuvarlama(float value) {
        return (float) (Math.round(value * 100.0) / 100.0);

      // TODO
      //     Bu yuvarlama işlemi için:
      //     1. value değeri 100 ile çarpılır: value * 100.0
      //        Bu ondalık basamakların 100 katına çıkarılmasını sağlar.
      //     2. Math.round() fonksiyonu ile yukarıya veya aşağıya en yakın tam sayıya yuvarlanır.
      //        Bu ondalık kısmın yuvarlanmasını gerçekleştirir.
      //     3. Yuvarlanan değer 100'e bölünerek orijinal sayıya geri dönülür: / 100.0
      //        Bu yuvarlanmış değeri orijinal formuna getirir, yani iki ondalık basamağa sahip bir float değeri elde ederiz.
      //     NOT: Bu işlem, float sayıdaki küçük hataları önlemek ve istenilen ondalık basamak hassasiyetini sağlamak
      //     amacıyla kullanılır. Özellikle finansal uygulamalarda ve benzer hassaslık gerektiren durumlarda,
      //     bu tür yuvarlama işlemleri yaygın olarak kullanılır.

    }
    }
