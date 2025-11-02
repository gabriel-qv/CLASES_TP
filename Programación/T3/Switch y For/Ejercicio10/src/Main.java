import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ejercicios, flexiones;
        String eleccion;
        Scanner scr = new Scanner(System.in);

        System.out.println("--- Ejercicios ---");
        System.out.println("1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");
        ejercicios = scr.nextInt();

        switch (ejercicios){
            case 1:
                eleccion = "flexiones";
                break;
            case 2:
                eleccion = "abdominales";
                break;
            case 3:
                eleccion = "sentadillas";
                break;
            default:
                System.out.println("Ingresa un valor válido");
                eleccion = "No tiene valor";
                break;
        }

        System.out.println("¿Cuántas repeticiones deseas hacer?");
        flexiones = scr.nextInt();

        int contador = 0;
        for (int i = 0; i < flexiones; i++) {
            contador ++;
            System.out.println("Repetición " + contador + " completada");
        }

        System.out.printf("¡Ejercicio completado! Has hecho %d %s ",contador, eleccion);
        System.gc();
        scr.close();
    }
}
