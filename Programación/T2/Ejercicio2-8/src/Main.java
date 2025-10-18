import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num1, num2, num3, rpt;
        float promedio, resultado;

        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa el primer valor:");
        num1 = scr.nextInt();

        System.out.println("Ingresa el segundo valor:");
        num2 = scr.nextInt();

        System.out.println("Ingresa el tercer valor:");
        num3 = scr.nextInt();

        rpt = num1 + num2 + num3;
        promedio = (float)num1 + (float)num2 + (float)num3/3;
        resultado = ((float)num1*(float)num2)/(float)num3;

        System.out.println("Suma de los tres números: " + rpt);
        System.out.printf("Promedio: %.2f %n",promedio);
        System.out.println("Resultado de (" + num1 + "*" + num2 + ")/" + num3 + ": " + resultado);

    }
}
