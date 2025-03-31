package Task_8;

import java.util.Scanner;

public class KahveMakinasi {
    public static void main(String[] args) {
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        String hangiKahve = "";

        System.out.println("1-) Türk Kahvesi");
        System.out.println("2-) Filtre Kahve");
        System.out.println("3-) Espresso");
        System.out.println("Hangi kahveyi istersiniz?");


        while (hangiKahve.isEmpty()) {
            System.out.print("Kahve adı girin: ");
            String kahve = okuStr.nextLine();

            if (kahve.equalsIgnoreCase("türk Kahvesi")) {
                hangiKahve = "Türk Kahvesi";
            }
            if (kahve.equalsIgnoreCase("filtre Kahve")) {
                hangiKahve = "Filtre Kahve";
            } else if (kahve.equalsIgnoreCase("espresso")) {
                hangiKahve = "Espresso";
            } else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin");
            }

        }
        System.out.println(hangiKahve + " hazırlanıyor...");

        while (true) {
            System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
            String süt = okuStr.nextLine();

            if (süt.equalsIgnoreCase("evet") || süt.equalsIgnoreCase("yes")) {
                System.out.println("Süt ekleniyor...");
                break;
            } else if ((süt.equalsIgnoreCase("hayır")) || (süt.equalsIgnoreCase("no"))) {
                System.out.println("Süt eklenmiyor...");
                break;
            } else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin");
            }
        }

        while (true) {
            System.out.println("Şeker eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
            String şeker = okuStr.nextLine();

            if (şeker.equalsIgnoreCase("evet") || şeker.equalsIgnoreCase("yes")) {
                System.out.println("Kaç şeker istersiniz?:");
                int kacSeker = okuInt.nextInt();
                System.out.println(kacSeker + " şeker ekleniyor.");
                break;
            } else if ((şeker.equalsIgnoreCase("hayır")) || (şeker.equalsIgnoreCase("no"))) {
                System.out.println("Şeker eklenmiyor...");
                break;
            } else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin");
            }

        }

        String boyut;
        while (true) {
            System.out.println("Hangi boyutta istersiniz? (Büyük - Orta - Küçük olarak giriniz.) :");
            boyut = okuStr.nextLine();

            if (boyut.equalsIgnoreCase("Büyük")) {
                System.out.println("Kahveniz" + boyut + " boyutta hazırlanıyor.");
                break;
            } else if (boyut.equalsIgnoreCase("Orta")) {
                System.out.println("Kahveniz" + boyut + " boyutta hazırlanıyor.");
                break;
            } else if (boyut.equalsIgnoreCase("Küçük")) {
                System.out.println("Kahveniz" + boyut + " boyutta hazırlanıyor.");
                break;
            } else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin");
            }

        }

        System.out.println("Siparişiniz :");
        System.out.println(hangiKahve+" "+boyut+" boy, hazır. Afiyet olsun!");

    }

}

