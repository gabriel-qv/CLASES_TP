import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float nota;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese su nota:");
        nota = scr.nextFloat();

        if (nota >= 5 && nota <= 10){
            System.out.println("Haz aprobado");
        } else if (nota < 5 && nota >= 0) {
            System.out.println("Estas suspendido");
        } else {
            System.out.println("Ingresa un valor correcto");
        }
    }
}
