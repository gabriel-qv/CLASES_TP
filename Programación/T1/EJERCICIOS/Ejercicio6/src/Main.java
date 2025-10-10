import java.util.Scanner;

public class Main {

    /*
    Escribe un programa que declare dos variables numéricas,
    realice las operaciones básicas (suma, resta, multiplicación
    y división) y muestre los resultados por consola.
     */

    public static void main(String[] args){
        double num1;
        double num2;

        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el primer valor");
        num1 = scn.nextInt();

        System.out.println("Ingrese el segundo valor");
        num2 = scn.nextInt();

        Operadores operar = new Operadores();
        operar.sumar(num1,num2);
        operar.resta(num1,num2);
        operar.mult(num1,num2);
        operar.div(num1,num2);

    }
}
