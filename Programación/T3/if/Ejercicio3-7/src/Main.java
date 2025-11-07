import java.util.Scanner;

public class Main {
    //Crea un programa que pida una nota numérica (0-10) y
    // determine la calificación: Suspenso (0-4), Aprobado (5-6),
    // Notable (7-8) o Sobresaliente (9-10).
    public static void main(String[] args) {
        int nota;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa tu nota");
        nota = scr.nextInt();

        if (nota > 10 || nota < 0){
            System.out.println("Ingrese usn valor válido");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Tu nota es sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Tu nota es notable");
        } else if (nota >= 5) {
            System.out.println("Estas aprobado");
        } else if (nota >= 0) {
            System.out.println("Estas desaprobado");
        }

    }
}
