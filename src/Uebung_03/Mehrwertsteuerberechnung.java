package Uebung_03;

public class Mehrwertsteuerberechnung {

    double brutto;
    double netto;
    double mwstSatz;
    double mwst;

    public Mehrwertsteuerberechnung(double brutto, double mwstSatz) {
        this.brutto = brutto;
        this.mwstSatz = mwstSatz;
        rechner();
    }

    private void rechner(){

        this.netto = this.brutto / (1 + mwstSatz);
        this.mwst = this.mwstSatz * this.netto;


        System.out.println("Netto-Betrag:" + this.netto);
        System.out.println("Mehrwertsteuer: " + this.mwst);

    }

}
