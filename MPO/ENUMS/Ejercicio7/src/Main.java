import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int punto;
        String nivel, mensaje;

        System.out.println("Ingresa tus puntos actuales");
        punto = scr.nextInt();

        if (punto>=0){
            if (punto<=100){
                nivel = "Principiante";
                mensaje = "A penas es el inicio";
            } else if (punto<=500){
                nivel = "Intermedio";
                mensaje = "Estas mejorando";
            } else if (punto<=100) {
                nivel = "Avanzado";
                mensaje = "Woao, eres muy bueno";
            } else if (punto<=5000) {
                nivel = "Experto";
                mensaje = "Por poco y te vuelves profesional";
            } else {
                nivel = "Maestro";
                mensaje = "O no tienes vida social, o eres profesional y ganas dinero";
            }
            System.out.println("Nivel actual: " + nivel);
            System.out.println(mensaje);
        } else {
            System.out.println("Ingresa un valor válido");
        }

    }
}
