import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner scr = new Scanner(System.in);
        do{
            System.out.println("Introduce tu edad");
            edad = scr.nextInt();
            if (edad < 1 || edad > 120){
                System.out.println("Edad no válida. Debe estar entre 0 y 120");
            } else {
                System.out.println("Edad válida: " + edad + " años. ¡Gracias!");
            }
        } while (edad > 120 || edad < 1);
    }
}
