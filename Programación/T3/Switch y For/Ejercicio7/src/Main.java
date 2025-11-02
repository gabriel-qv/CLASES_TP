import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numFinal, numInicial, total=0, texto;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el número n (inicio)");
        numInicial = scr.nextInt();
        texto = numInicial;

        System.out.println("Ingrese el número N (final)");
        numFinal = scr.nextInt();

        for (int i = numInicial; i <= numFinal; i++) {
            total += i;
        }

        System.out.printf("Sumando: %d ",numInicial);
        for (int j = numInicial; j < numFinal; j++) {
            texto++;
            System.out.printf("+ %d ", texto);
        }

        System.out.printf("%nSuma de %d al %d es: %d", numInicial, numFinal,total);
    }
}
