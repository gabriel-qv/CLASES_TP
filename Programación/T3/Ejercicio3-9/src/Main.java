import model.CalculoIMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double peso, altura, imc;
        Scanner scr = new Scanner(System.in);

        do {
            System.out.println("Ingrese su peso");
            peso = scr.nextDouble();

            if (peso <= 0){
                System.out.println("Valor inválido. Intente nuevamente.");
            }
        } while (peso <= 1);

        do {
            System.out.println("Ingrese su altura");
            altura = scr.nextDouble();

            if (altura <= 0){
                System.out.println("Valor inválido. Intente nuevamente.");
            }
        } while (altura <= 0);

        imc = peso/(altura*altura);

        CalculoIMC calcularIMC = new CalculoIMC();
        calcularIMC.calculo(imc);

    }
}
