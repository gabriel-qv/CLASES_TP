import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scr;
        scr = new Scanner(System.in);
        double num1, num2;
        System.out.println("Ingrese el primer número:");
        num1 = scr.nextDouble();
        System.out.println("Ingrese el segundo número:");
        num2 = scr.nextDouble();

        Operadores operar = new Operadores();
        operar.sumar(num1,num2);
        operar.restar(num1,num2);
        operar.multiplicacion(num1,num2);
        operar.division(num1,num2);
        operar.modulo(num1,num2);

    }

}
