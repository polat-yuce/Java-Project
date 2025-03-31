import java.util.Scanner;

public class SifreBelirleme {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        String kullanici_adi;
        String sifre;
        String sifre_tekrar;

        do {
            System.out.print("Kullanıcı adını belirleyin: ");
            kullanici_adi = oku.nextLine();

            System.out.print("Şifrenizi belirleyin: ");
            sifre = oku.nextLine();

            System.out.print("Şifrenizi tekrar girin: ");
            sifre_tekrar = oku.nextLine();

            if (!(sifre.equals(sifre_tekrar))) System.out.println("---- Hatalı! Tekrar giriş yapmayı deneyiniz. ----");
            System.out.println();

        } while (!sifre_tekrar.equals(sifre));

        System.out.println("--- Giriş Yap ---");

        int sayac = 3;

        while (sayac > 0) {
            System.out.print("Kullanıcı Adı: ");
            String kullanici_adi_2 = oku.nextLine();
            System.out.print("Şifre: ");
            String sifre_tekrar_2 = oku.nextLine();

            if ((kullanici_adi.equals(kullanici_adi_2)) && (sifre_tekrar_2.equals(sifre))) {
                System.out.println("Başarılı bir şekilde giriş yaptınız, " + kullanici_adi + " kullanıcısı olarak sisteme hoş geldiniz!");
                break;

            } else {
                sayac--;

                if (sayac > 0) {
                    System.out.println("Hatalı giriş. Kalan hakkınız: " + sayac);
                } else {
                    System.out.println("Üzgünüm, 3 kez üst üste yanlış giriş yaptınız.");
                    System.out.println("İyi Günler");
                }

            }

        }


    }
}
