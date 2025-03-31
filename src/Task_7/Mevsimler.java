import java.util.Scanner;

public class Mevsimler {
    public static void main(String[] args) {
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        System.out.print("Ayı girin (1-12): ");
        int ay = okuInt.nextInt();

        System.out.print("Günü girin: ");
        int gun = okuInt.nextInt();

        String mevsim = "";
        if ((ay == 3 && gun >= 20) || (ay == 4 || ay == 5) || (ay == 6 && gun <= 20))
            mevsim = "İlkbahar";
         if ((ay == 6 && gun > 20) || (ay == 7 || ay == 8) || (ay == 9 && gun <= 21))
            mevsim = "Yaz";
         if ((ay == 9 && gun > 21) || (ay == 10 || ay == 11) || (ay == 12 && gun <= 20))
            mevsim = "Sonbahar";
         if ((ay == 12 && gun >= 21) || (ay == 1 || ay == 2) || (ay == 3 && gun <= 19))
            mevsim = "Kış";

        System.out.println("Mevsim = " + mevsim);
    }
}
