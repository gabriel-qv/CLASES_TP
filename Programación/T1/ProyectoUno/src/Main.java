import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int num1;
        int num2;
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrse el primer número");
        num1 = scn.nextInt();

        System.out.println("Ingrese el segundo número");
        num2 = scn.nextInt();

        int rpta = num1 + num2;

        System.out.println("El resultado es " + rpta);

    }

}
