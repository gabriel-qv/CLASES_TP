import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = scr.nextInt();

        if (edad >= 16){
            System.out.println("Acceso permitido.");
        } else if (edad > 0) {
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        } else {
            System.out.println("Introduce un valor válido");
        }
    }
}
