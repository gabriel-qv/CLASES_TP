import java.util.Scanner;

public class Main {

    /* Crea un programa que defina una variable
    llamada puntuación con valor inicial 0. Luego,
    modifica su valor tres veces y muestra el resultado
    final.*/

    public static void main (String[] args){
        int puntos;
        puntos = 0;
        int puntosuno, puntosdos, puntostres, puntofinal;

        Scanner scnuno = new Scanner(System.in);
        Scanner scndos = new Scanner(System.in);
        Scanner scntres = new Scanner(System.in);

        System.out.println("1ra modificación");
        puntosuno = scnuno.nextInt();

        System.out.println("2da moficicación");
        puntosdos = scndos.nextInt();

        System.out.println("3ra moficicación");
        puntostres = scntres.nextInt();

        System.out.println("Puntuación inicial: " + puntos);

        puntofinal = puntos + puntosuno;
        System.out.println("Después de primera modificación: " + puntofinal);

        puntofinal = puntofinal + puntosdos;
        System.out.println("Después de segunda modificación: " + puntofinal);

        puntofinal = puntofinal + puntostres;
        System.out.println("Puntuación final: " + puntofinal);

    }
}
