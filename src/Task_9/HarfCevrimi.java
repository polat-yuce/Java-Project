import java.util.Scanner;

public class HarfCevrimi {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle = oku.nextLine();

        String buyukHarf=buyukHarfFormati(cumle);
        System.out.println("BÜYÜK HARF FORMATI = " + buyukHarf);

        String kucukHarf=kucukHarfFormati(cumle);
        System.out.println("küçük harf formatı = " + kucukHarf);

    }

    public static String buyukHarfFormati(String cumle) {
        String a = cumle.toUpperCase();
        return a;
    }

    public static String kucukHarfFormati(String cumle) {
        String a = cumle.toLowerCase();
        return a;
    }
}
