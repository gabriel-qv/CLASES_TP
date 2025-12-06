import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingresa el límite para Fibonacci");
        int limite = scr.nextInt();
        generarFibonacci(limite);
    }

    public static void generarFibonacci(int limiteM){
        int numA = 0;
        int suma = 1;
        int guardar = 0;
        System.out.print("0, 1, ");
        while (true){
            guardar = suma;
            suma = numA + suma;
            System.out.print(suma);
            numA = guardar;
            if (suma >= limiteM){
                break;
            }
            System.out.print(", " );
        }
    }
}
