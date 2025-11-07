import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, contador = 0;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa un número para contar");
        numero = scr.nextInt();

        if (numero>=0){
            while (contador<=numero){
                System.out.println(contador);
                contador ++;
            }
        } else {
            while (contador>=numero){
                System.out.println(contador);
                contador--;
            }
        }
        System.out.println("Fin del conteo");
    }
}
