import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        String name;
        int edad;
        boolean carnet, alquiler, mayor;

        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa tu nombre completo");
        name = scr.nextLine();
        System.out.println("Ingresa tu edad");
        edad = scr.nextInt();
        System.out.println("¿Posees carnet de conducir? (true/false)");
        carnet = scr.hasNextBoolean();

        mayor = edad>=21;
        alquiler = edad>=21 && carnet==true;

        System.out.println("Nombre: " + name);
        System.out.println("¿Mayor de 21 años? " + mayor);
        System.out.println("¿Tienes carnet? " + carnet);
        System.out.println("¿Puede alquilar un coche? " + alquiler);


    }
}
