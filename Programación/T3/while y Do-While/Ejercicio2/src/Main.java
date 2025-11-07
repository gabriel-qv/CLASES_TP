import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String contraseña, contraseñaLogin;
        Scanner scr = new Scanner(System.in);
        boolean acceso = true;
        int intentos = 0, intentosRestantes = 3;

        System.out.println("Crea una contraseña");
        contraseña = scr.nextLine();
        do {
            System.out.println("Ingresa tu contraseña");
            contraseñaLogin = scr.nextLine();
            if (contraseñaLogin.equals(contraseña)){
                System.out.println("Contraseña correcta. Accediendo...");
                acceso = true;
            } else {
                System.out.println("Contraseña incorrecta. Intentos restantes: " + intentosRestantes);
                acceso = false;
                intentos++;
                intentosRestantes--;
            }
        } while (!acceso && intentos<=3);
        if (!acceso){
            System.out.println("Acceso bloqueado");
        }

        System.out.println("Saliendo del programa...");
    }
}
