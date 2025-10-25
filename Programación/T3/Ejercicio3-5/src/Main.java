import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, resto;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa un número ENTERO:");
        num = scr.nextInt();

        resto = num%2;

        if (resto == 0){
            System.out.printf("El número %d es par", num);
        } else if (resto == 1 || resto == -1) {
            System.out.printf("El número %d es impar", num);
        } else {
            System.out.println("Ingresa un carácter válido");
        }

    }
}
