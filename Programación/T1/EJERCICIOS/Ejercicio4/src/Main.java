import java.util.Scanner;

public class Main {

    /*
    rea un programa que simule la información de un libro usando variables
    con nombres descriptivos. Muestra toda la información del libro en la consola.
     */

    public static void main(String[] args){
        String libro, autor, respuesta;
        int year, pag;
        boolean disponibilidad = false;

        Scanner scn = new Scanner(System.in);
        Scanner rpt = new Scanner(System.in);

        System.out.println("¿Cuál es el titulo de la obra?");
        libro = scn.nextLine();

        System.out.println("¿Quién es el autor?");
        autor = scn.nextLine();

        System.out.println("Año de publicación");
        year = scn.nextInt();

        System.out.println("Número de páginas");
        pag = scn.nextInt();

        System.out.println("¿Está disponible en la biblioteca? (si/no)");
        respuesta = rpt.nextLine().trim().toLowerCase();

        if (respuesta.equals("sí")||respuesta.equals("si")){
            disponibilidad = true;
        } else if (respuesta.equals("no")){
            disponibilidad = false;
        } else {
            System.out.println("Respuesta no válida. Se asumirá que no está disponible");
        }

        System.out.println("Titulo: "+ libro);
        System.out.println("Autor: "+ autor);
        System.out.println("Año de publicación: "+ year);
        System.out.println("Número de páginas: "+ pag);
        System.out.println("¿Disponible en la biblioteca?: "+disponibilidad);

    }
}
