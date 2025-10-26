import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int edad;
    double salario;
    String respuesta;
    boolean rangoEdad, salarioMin, elegible;
    boolean entradaValidada = false;
    boolean deudas = false;
    Scanner scr = new Scanner(System.in);

    do {
        System.out.println("Ingresa tu edad");
        edad = scr.nextInt();
        rangoEdad = edad>=21 && edad<=65;

        if (edad<=0){
            System.out.println("Ingrese un valor válido");
        }

    } while (edad<=0);

    System.out.println("Salario mensual");
    salario = scr.nextDouble();
    salarioMin = salario>= 1000;

    do {
        System.out.println("¿Sin deudas pendientes?");
        respuesta = scr.next().trim().toLowerCase();
        if (respuesta.equals("si") || respuesta.equals("sí") || respuesta.equals("true")){
            deudas = true;
            entradaValidada = true;
        } else if (respuesta.equals("no") || respuesta.equals("false")) {
            deudas = false;
            entradaValidada = true;
        } else {
            System.out.println("Ingrese una respuesta válida.");
        }
    } while (!entradaValidada);

    if (rangoEdad && salarioMin && deudas){
        elegible = true;
        System.out.println("¿Cumples con el rango de edad? "+ rangoEdad);
        System.out.println("¿Cumples con el salario mínimo? "+ salarioMin);
        System.out.println("¿Sin deudas pendientes? "+ deudas);
        System.out.println("¿Eres elegible?: " + elegible);
        System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");
    } else {
        elegible = false;
        System.out.println("¿Cumples con el rango de edad? "+ rangoEdad);
        System.out.println("¿Cumples con el salario mínimo? "+ salarioMin);
        System.out.println("¿Sin deudas pendientes? "+ deudas);
        System.out.println("¿Eres elegible?: " + elegible);
        System.out.println("Lo sentimos, no cumples con los requisitos.");
    }

    }
}
