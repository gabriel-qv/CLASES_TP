import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numFinal = 0, total=1, texto;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el número N (final)");
        numFinal = scr.nextInt();
        texto = numFinal;

        for (int i = 1; i <= numFinal; i++) {
            total *= i;
        }

        System.out.printf("Calculando: %d! %n",numFinal);
        System.out.printf("%d ",numFinal);
        for (int j = 1; j < numFinal; j++) {
            texto--;
            System.out.printf("x %d ", texto);
        }

        System.out.printf("%nEl factorial de %d es: %d", numFinal,total);
    }
}
