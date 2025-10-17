import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numero, modulo;
        int cero = 0;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa un número entero");
        numero = scr.nextInt();

        modulo = numero % 2;

        boolean key = (modulo == 0);

        if (key){ //antes le habia puesto "Key = true" eso esta mal porque asigna true a la variable key, debi haber usado "==" o dirdctamente "key"
            System.out.println("El número "+numero+" es par.");
        } else {
            System.out.println("El número "+numero+" es impar (resto al dividir entre 2: "+ modulo+")");
        }
    }
}
