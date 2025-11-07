import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int respuesta, suma = 0;
        Scanner scr = new Scanner(System.in);

        do {
            System.out.println("Ingrese número (0 o negativo para salir)");
            respuesta = scr.nextInt();
            if (respuesta>0){
                suma += respuesta;
            }
        } while (respuesta>=1);

        System.out.println("Suma total: " + suma);
    }
}
