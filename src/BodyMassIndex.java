import java.util.Scanner;
import java.lang.Math;
public class BodyMassIndex {
    public static double bodyMassBerechnen () {
        Scanner scanner = new Scanner(System.in);
        // Init. Gewicht in Kilo with scanner
        double gewichtInput = 0;
        System.out.println("Gewicht in Kilogramm Eingabe: ");
        gewichtInput = scanner.nextDouble();
        // Init Körpergröße in Meter with scanner
        double koerpergroesseInput = 0;
        System.out.println("Groeße in Meter Eingabe: ");
        koerpergroesseInput = scanner.nextDouble();
        // Init. int BMI
        int bmi = 0;
        // Init. ZwischenVariable
        double koerperGroessePow2 = 0;
        if ((gewichtInput > 0) && (koerpergroesseInput > 0)) {
            koerperGroessePow2 = Math.pow(koerpergroesseInput, 2);
            bmi = (int)(gewichtInput / koerpergroesseInput);
            System.out.println("BMI: " + bmi);
        }
        else {
            System.out.println("Eingabefehler");
            scanner.close();
        }
        BodyMassIndex.entscheider(bmi, koerpergroesseInput, gewichtInput);
        scanner.close();
        return bmi;
    }
    public static void ausgeben(boolean candidatAngenommen) {
        if (candidatAngenommen) {
            System.out.println("Kandidatin angenommen");
        }
        else {
            System.out.println("Kandidatin abgelehnt");
        }
    }
    public static void entscheider (double bmi, double koerpergroesse, double gewicht) {
        boolean candidatAngenommen;
        if ((bmi <= 20.0) && (koerpergroesse > 1.75)) {
            candidatAngenommen = true;
            ausgeben(candidatAngenommen);
        }
        else {
            candidatAngenommen = false;
            ausgeben(candidatAngenommen);
        }
    }
}
