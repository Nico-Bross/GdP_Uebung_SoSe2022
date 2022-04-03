package Uebung_03;

public class TemperatureRechner {
    double fahrenheit;
    double celsius;

    public TemperatureRechner(float celsius) {

        this.celsius = celsius;
        rechner();
    }

    private void rechner (){

        this.fahrenheit = 9.0/5.0 * this.celsius + 32.0;

        System.out.println(Math.round(this.celsius) + " Grad Celsius entsprechen "+ Math.round(this.fahrenheit) + " Grad Fahrenheit.");

    }
}
