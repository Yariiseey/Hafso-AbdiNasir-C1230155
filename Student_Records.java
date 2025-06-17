import java.util.Scanner;
public class Student_Records{
    private static String magac1, magac2, magac3;
    private static double darajo1, darajo2, darajo3;
    private static int tirada = 0;

    private static double wadarta = 0;
    private static double uguBadnaan = -1;
    private static double uguYaraan = 101;

    public static void main(String[] args) {
        Scanner galin = new Scanner(System.in);
        int doorasho;

        do {
            System.out.println("    Nidaamka Maamulka Ardayda");
            System.out.println("1. Ku dar arday");
            System.out.println("2. Tus warbixin");
            System.out.println("3. Raadso arday");
            System.out.println("4. Bax");
            doorasho = galin.nextInt();

            if (doorasho == 1) darArday(galin);
            else if (doorasho == 2) warbixin();
            else if (doorasho == 3) raadsoArday(galin);
        } while (doorasho != 4);
    }

    private static void darArday(Scanner g) {
        if (tirada >= 3) {
            System.out.println("Arday dheeraad ah lama darikaro.");
            return;
        }

        System.out.print("Magaca ardayga: ");
        String magaca = g.next();

        System.out.print("Darajada: ");
        double darajo = g.nextDouble();

        tirada++;
        wadarta += darajo;
        if (darajo > uguBadnaan) uguBadnaan = darajo;
        if (darajo < uguYaraan) uguYaraan = darajo;

        if (tirada == 1) { magac1 = magaca; darajo1 = darajo; }
        else if (tirada == 2) { magac2 = magaca; darajo2 = darajo; }
        else { magac3 = magaca; darajo3 = darajo; }

        System.out.println("Arday la daray: " + magaca);
    }

    private static void warbixin() {
        if (tirada == 0) {
            System.out.println("arday mjiro macnaha malahaayo.");
            return;
        }

        double celcelis = Math.round((wadarta / tirada) * 100) / 100.0;

        System.out.println("Tirada Ardayda: " + tirada);
        System.out.println("Celcelis: " + celcelis);
        System.out.println("Darajada ugu sarraysa: " + uguBadnaan);
        System.out.println("Darajada ugu hooseysa: " + uguYaraan);
    }

    private static void raadsoArday(Scanner g) {
        if (tirada == 0) {
            System.out.println("Arday lama heli karo.");
            return;
        }

        System.out.print("Gali magaca aad raadineyso: ");
        String raadso = g.next();

        if (raadso.equalsIgnoreCase(magac1))
            System.out.println("Darajada waa: " + darajo1);
        else if (raadso.equalsIgnoreCase(magac2))
            System.out.println("Darajada waa: " + darajo2);
        else if (raadso.equalsIgnoreCase(magac3))
            System.out.println("Darajada waa: " + darajo3);
        else
            System.out.println("Lama helin.");
    }
}
