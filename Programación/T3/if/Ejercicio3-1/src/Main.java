import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = scr.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad, puedes votar");
        } else if (edad <= 0) {
            System.out.println("Valor no admitido.");
        } else {
            System.out.println("Eres menor de edad, no puedes votar.");
        }
    }
}
