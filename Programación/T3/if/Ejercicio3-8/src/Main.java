import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float num1, num2, num3;
        boolean ascendente, descemdemte;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa el primer valor");
        num1 = scr.nextFloat();

        System.out.println("Ingresa el segundo valor");
        num2 = scr.nextFloat();

        System.out.println("Ingresa el tercer valor");
        num3 = scr.nextFloat();

        ascendente = num1<num2 && num2<num3;
        descemdemte = num1>num2 && num2>num3;



        if (ascendente){
            System.out.printf("El número %.2f es el más menor %n El número %.2f es intermedio %n El número %.2f es el mayor", num1, num2, num3);
        } else if (descemdemte) {
            System.out.printf("El número %.2f es el más mayor %n El número %.2f es intermedio %n El número %.2f es el menor", num1, num2, num3);
        } else if (num2 < num1 && num2 < num3 && num1 < num3){
            System.out.printf("El número %.2f es el más mayor %n El número %.2f es intermedio %n El número %.2f es el menor", num3, num1, num2);
        } else if (num2 < num1 && num2 < num3 && num3 < num1) {
            System.out.printf("El número %.2f es el más mayor %n El número %.2f es intermedio %n El número %.2f es el menor", num1, num3, num2);
        } else if (num2 > num1 && num2 > num3 && num3 < num1) {
            System.out.printf("El número %.2f es el más mayor %n El número %.2f es intermedio %n El número %.2f es el menor", num2, num1, num3);
        } else if ((num2 > num1 && num2 > num3 && num1 < num3)) {
            System.out.printf("El número %.2f es el más mayor %n El número %.2f es intermedio %n El número %.2f es el menor", num2, num3, num1);

        }
    }
}
