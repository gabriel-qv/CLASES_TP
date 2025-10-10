import java.util.Scanner;

public class Main {

    /*
    Crea un programa que defina tres variables: nombre,
    edad y ciudad. Asigna valores a cada una y muestra
    su contenido en la consola.
     */

    public static void main (String[] args){
        String name;
        int edad;
        String city;

        Scanner scn = new Scanner(System.in);
        Scanner cit = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        name = scn.nextLine();

        System.out.println("¿Cuántos años tienes?");
        edad = scn.nextInt();

        System.out.println("¿En qué ciudad vives?");
        city = cit.nextLine();

        System.out.println("Hola " + name + ", tienes " + edad + " y vives en la ciudad de " + city + ".");

    }
}
