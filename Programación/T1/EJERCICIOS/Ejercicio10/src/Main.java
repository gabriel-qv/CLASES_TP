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

        if (rptaTemp.equals("1")){
            System.out.println("A que unidad lo quiere convertir:" +
                    "\n1. Fahrenheit (°F)" +
                    "\n2. Kelvin (K)" +
                    "\n3. Rankine (°R");
            rptaConv = scn.next();

            if (rptaConv.equals("1")){

            } else if (rptaConv.equals("2")) {

            } else if (rptaConv.equals("3")) {

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

            } else if (rptaConv.equals("2")) {

            } else if (rptaConv.equals("3")) {

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

            } else if (rptaConv.equals("2")) {

            } else if (rptaConv.equals("3")) {

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

            } else if (rptaConv.equals("2")) {

            } else if (rptaConv.equals("3")) {

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
