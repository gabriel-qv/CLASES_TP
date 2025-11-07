import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random random = new Random();
        int respuesta, intentos = 0;
        int numeroRandom = random.nextInt(10) + 1; //genera un número de 0 a 9
        // (límite 10) por eso se le suma +1, si sale 0 será 1, si sale 9, será 10
        // (máx - min + 1) + min;
        do {
            System.out.println("Adivina el número del 1 al 10 (0 para salir)");
            respuesta = scr.nextInt();
            if (respuesta>numeroRandom) {
                System.out.println("El número menor. Intenta de nuevo.");
            } else if (respuesta<numeroRandom && respuesta!=0) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            }
            intentos++;
            if (respuesta==numeroRandom){
                System.out.println("¡Felicidades acertaste!");
                System.out.println("Número de intentos: " + intentos);
            }
        } while (respuesta != numeroRandom);
        System.out.println("Saliendo del programa...");
    }
}
