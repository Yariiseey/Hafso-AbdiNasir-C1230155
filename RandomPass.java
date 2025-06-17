import java.util.Scanner;

public class RandomPass {
    public static void main(String[] args) {
        Scanner akhri = new Scanner(System.in);

        System.out.print("Geli tirada dhererka furaha sirta (ugu yaraan 8): ");
        int dherer = akhri.nextInt();

        if (dherer < 8) {
            System.out.println("Furaha sirta waa in uu noqdaa ugu yaraan 8 xaraf.");
            return;
        }

        String xarfahaWaaweyn = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String xarfahaYaryar = "abcdefghijklmnopqrstuvwxyz";
        String tirooyin = "0123456789";
        String astaamo = "!@#$%^&*";
        String dhammaan = xarfahaWaaweyn + xarfahaYaryar + tirooyin + astaamo;

        char xaraf1 = xarfahaWaaweyn.charAt((int)(Math.random() * xarfahaWaaweyn.length()));
        char xaraf2 = xarfahaYaryar.charAt((int)(Math.random() * xarfahaYaryar.length()));
        char xaraf3 = tirooyin.charAt((int)(Math.random() * tirooyin.length()));
        char xaraf4 = astaamo.charAt((int)(Math.random() * astaamo.length()));

        String intiisaKale = "";
        for (int i = 0; i < dherer - 4; i++) {
            int boos = (int)(Math.random() * dhammaan.length());
            intiisaKale += dhammaan.charAt(boos);
        }

        String iskuDarkii = "" + xaraf1 + xaraf2 + xaraf3 + xaraf4 + intiisaKale;

        String furahaUguDambeeya = "";
        String kumeelgaar = iskuDarkii;
        while (!kumeelgaar.isEmpty()) {
            int boos = (int)(Math.random() * kumeelgaar.length());
            furahaUguDambeeya += kumeelgaar.charAt(boos);
            kumeelgaar = kumeelgaar.substring(0, boos) + kumeelgaar.substring(boos + 1);
        }

        System.out.println("Furaha sirtaada: " + furahaUguDambeeya);
    }
}
