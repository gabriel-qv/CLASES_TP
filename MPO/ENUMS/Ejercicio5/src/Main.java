import java.awt.image.TileObserver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, total =0;
        char operador;
        Scanner scr = new Scanner(System.in);

        System.out.println("Introduce el primer valor");
        num1 = scr.nextDouble();

        System.out.println("Introduce el segundo valor");
        num2 = scr.nextDouble();

        System.out.println("Introduce el operador");
        operador = scr.next().charAt(0);

        switch (operador){
            case '+'->{
                total = num1 + num2;
                System.out.println("Resultado: " + total);
            }
            case '-'->{
                total = num1 - num2;
                System.out.println("Resultado: " + total);
            }
            case '*'->{
                total = num1 * num2;
                System.out.println("Resultado: " + total);

            }
            case '/'->{
                if (num1 == 0 || num2 == 0){
                    System.out.println("Introduce un valor que no sea cero");
                } else {
                    total = num1 / num2;
                    System.out.println("Resultado: " + total);
                }
            }
            default -> {
                System.out.println("Introduce un operador válido (+. -. *. /)");
            }
        }


    }
}
