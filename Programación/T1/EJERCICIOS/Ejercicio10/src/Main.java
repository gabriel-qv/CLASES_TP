import conversiones.Celsius;
import conversiones.Fahre;
import conversiones.Kelvin;
import conversiones.Rankine;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        /*
        Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
        Usa una variable para la temperatura en Celsius y muestra el resultado de la
        conversión.
                La fórmula para convertir de Celsius a Fahrenheit es:
                F = C × 9/5 + 32
                Ejemplo de salida por consola:
         */
        String rptaTemp, rptaConv;
        double val1;
        Scanner scn = new Scanner(System.in);

        System.out.println("Unidad de temp:" +
                "\n1. Celsius (°C)" +
                "\n2. Fahrenheit (°F)" +
                "\n3. Kelvin (K)" +
                "\n4. Rankine (°R)");
        rptaTemp = scn.next();

        System.out.println("Ingrese su valor:");
        val1 = scn.nextDouble();

        Celsius cel = new Celsius();
        Fahre fah = new Fahre();
        Kelvin kel = new Kelvin();
        Rankine ran = new Rankine();

        if (rptaTemp.equals("1")){
            System.out.println("A que unidad lo quiere convertir:" +
                    "\n1. Fahrenheit (°F)" +
                    "\n2. Kelvin (K)" +
                    "\n3. Rankine (°R");
            rptaConv = scn.next();

            if (rptaConv.equals("1")){
                cel.fahrenheit(val1);
            } else if (rptaConv.equals("2")) {
                cel.kelvin(val1);
            } else if (rptaConv.equals("3")) {
                cel.rankine(val1);
            } else {
                System.out.println("Ingresa un valor correcto");
                System.exit(0);
            }

        } else if (rptaTemp.equals("2")) {
            System.out.println("Unidad de temp:" +
                    "\n1. Celsius (°C)" +
                    "\n2. Kelvin (K)" +
                    "\n3. Rankine (°R)");
            rptaConv = scn.next();

            if (rptaConv.equals("1")){
                fah.celsius(val1);
            } else if (rptaConv.equals("2")) {
                fah.kelvin(val1);
            } else if (rptaConv.equals("3")) {
                fah.rankine(val1);
            } else {
                System.out.println("Ingresa un valor correcto");
                System.exit(0);
            }

        } else if (rptaTemp.equals("3")) {
            System.out.println("Unidad de temp:" +
                    "\n1. Celsius (°C)" +
                    "\n2. Fahrenheit (°F)" +
                    "\n3. Rankine (°R)");
            rptaConv = scn.next();

            if (rptaConv.equals("1")){
                kel.celsius(val1);
            } else if (rptaConv.equals("2")) {
                kel.fahrenheit(val1);
            } else if (rptaConv.equals("3")) {
                kel.rankine(val1);
            } else {
                System.out.println("Ingresa un valor correcto");
                System.exit(0);
            }

        } else if (rptaTemp.equals("4")) {
            System.out.println("Unidad de temp:" +
                    "\n1. Celsius (°C)" +
                    "\n2. Fahrenheit (°F)" +
                    "\n3. Kelvin (K)");
            rptaConv = scn.next();

            if (rptaConv.equals("1")){
                ran.celsius(val1);
            } else if (rptaConv.equals("2")) {
                ran.fahrenheit(val1);
            } else if (rptaConv.equals("3")) {
                ran.kelvin(val1);
            } else {
                System.out.println("Ingresa un valor correcto");
                System.exit(0);
            }

        } else {
            System.out.println("Ingrese un valor correcto");
            System.exit(0);
        }


    }
}
