import java.util.Scanner;

public class Main {

    /*
    Crea un programa que use constantes para almacenar información
    que no debe cambiar (como el valor de PI o el nombre de una aplicación)
    y variables para información que puede cambiar. Muestra todos los valores.
     */

    public static void main(String[] args){
        final String app;
        final String version;
        String usuario;
        final double pi = 3.14159;
        int punt = 0;
        int niv = 1;

        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la app:");
        app = scn.nextLine();

        System.out.println("Ingrese la versión actual:");
        version = scn.nextLine();

        System.out.println("Ingrese su usuario:");
        usuario = scn.nextLine();

        System.out.println("Aplicación: " + app);
        System.out.println("Versión: " + version);
        System.out.println("Valor de PI: " + pi);
        System.out.println("Usuario actual: " + usuario);
        System.out.println("Puntuación: " + punt);
        System.out.println("Nivel: " + niv);

        niv = 2;

        System.out.println("Ingrese su usuario:");
        usuario = scn.nextLine();

        System.out.println("Ingrese los puntos que desea:");
        punt = scn.nextInt();

        System.out.println("Usuario actualizado: " + usuario);
        System.out.println("Nivel actualizado: " + niv);
        System.out.println("Puntuación actualizada: " + punt);


    }
}
