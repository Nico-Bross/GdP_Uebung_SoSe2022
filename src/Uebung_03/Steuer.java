package Uebung_03;
import java.util.Scanner;
public class Steuer {

    public static void main(String[] args) {
        Scanner bruttoBetrag = new Scanner(System.in);

        System.out.println("Brutto-Betrag eingeben: ");
        double brutto = bruttoBetrag.nextDouble();
        System.out.println("Mehrwertstuersatz eingeben: ");
        double mwstSatz = bruttoBetrag.nextDouble();

        bruttoBetrag.close();

        new Mehrwertsteuerberechnung(brutto, mwstSatz);

    }
}
