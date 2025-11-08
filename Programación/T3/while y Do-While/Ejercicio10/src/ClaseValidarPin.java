import java.util.Scanner;

public class ClaseValidarPin {
    public boolean[] metodoValidarPin(int pinOriginal){
        boolean salir = false, pinIncorrecto = true;
        Scanner scr = new Scanner(System.in);
        int pinIngresado;
        do{
            System.out.println("Introduzca su pin actual (Press 0 para salir)");
            pinIngresado = scr.nextInt();
            if (pinIngresado <= 9999 && pinIngresado >= 1000 && pinIngresado == pinOriginal){
                System.out.println("Ingresando...");
                pinIncorrecto = false;
            } else if (pinIngresado == 0){
                System.out.println("Saliendo...");
                salir = true;
                pinIncorrecto = false;
            } else {
                System.out.println("Pin incorrecto. Intente nuevamente.");
            }
        } while (pinIncorrecto);

        return new boolean[]{pinIncorrecto,salir};
    }
}
