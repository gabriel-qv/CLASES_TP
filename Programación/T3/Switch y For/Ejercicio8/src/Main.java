import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numFinal, numInicial, pares = 0, impares = 0, total = 0;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el número n (inicio)");
        numInicial = scr.nextInt();

        System.out.println("Ingrese el número N (final)");
        numFinal = scr.nextInt();

        for (int i = numInicial; i <= numFinal; i++) {
            total += i;
            if (total%2==0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números pares encontrados: " + pares);
        System.out.println("Números impares encontrados: "+ impares);

    }
}
