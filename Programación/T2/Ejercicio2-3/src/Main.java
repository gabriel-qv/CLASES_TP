import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int valor;
        int data;
        System.out.println("Ingresa el valor inicial:");
        valor = scr.nextInt();

        System.out.println("Cuánto le quieres sumar: (¡Solo números enteros!)");
        data = scr.nextInt();
        valor += data;
        System.out.println("Después de sumar "+data+": " + valor);

        System.out.println("Cuánto le quieres restar: (¡Solo números enteros!)");
        data = scr.nextInt();
        valor -= data;
        System.out.println("Después de restar "+data+": " + valor);

        System.out.println("¿Por cuanto quieres multiplicarlo?: (¡Solo números enteros!)");
        data = scr.nextInt();
        valor *= data;
        System.out.println("Después de multiplicar por "+data+": " + valor);

        System.out.println("¿Por cuánto lo quieres dividir?"+data+": (¡Solo números enteros!)");
        data = scr.nextInt();
        valor /= data;
        System.out.println("Después de dividir entre "+data+": " + valor);
    }
}
