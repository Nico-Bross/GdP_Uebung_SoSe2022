package Uebung_03;

import java.util.Scanner;

public class TemperatureUmwandler {

    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);

        float celsius = temp.nextFloat();

        temp.close();

        new TemperatureRechner(celsius);



    }
}
