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

    public boolean validarAccion(int pinOriginal){
        boolean pinCorrecto = false, seguirPidiendo = true;
        Scanner scr = new Scanner(System.in);
        int validacion;
        int intentos = 4;
        do {
            System.out.println("Introduce tu pin actual:");
            System.out.println("Press 0 para cancelar operación");
            validacion = scr.nextInt();
            if (validacion == pinOriginal){
                System.out.println("Ingresando...");
                seguirPidiendo = false;
                pinCorrecto = true;
            } else if (validacion == 0){
                System.out.println("Saliendo...");
                pinCorrecto = false;
                seguirPidiendo = false;
            } else {
                System.out.println("Pin incorrecto. Intente nuevamente.");
                System.out.println("Intentos restantes " + (intentos-1));
                intentos--;
                if (intentos == 0){
                    pinCorrecto = false;
                    seguirPidiendo = false;
                }
            }
        }while (seguirPidiendo);
        return pinCorrecto;
    }
}
