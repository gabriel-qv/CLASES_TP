import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double num;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese un número");
        num = scr.nextDouble();

        if (num > 0){
            System.out.printf("El número ingresado %.2f es positivo", num);
        } else if (num == 0) {
            System.out.printf("El número ingresado es %d", num.intValue());
        } else {
            System.out.printf("El número ingresado %.2f es negativo", num);
        }
    }
}
