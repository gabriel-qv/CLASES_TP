import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String contraseña;
        System.out.println("Ingresa la contraseña:");
        System.out.println("""
                Requisitos: 
                1. 8 carácteres mín.
                2. Debe contener al menos una mayúscula.
                3. Debe contener al menos un número.
                             """);
        contraseña = scr.nextLine();
        if (validarContraseña(contraseña)){
            System.out.println("Contraseña válida");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }

    }
    public static boolean validarContraseña(String password){
        if (password.length() >= 8){
            boolean tieneMayuscula = false;
            boolean tieneNumero = false;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)){
                    tieneMayuscula = true;
                }
                if (Character.isDigit(c)){
                    tieneNumero = true;
                }
            }
            return tieneNumero && tieneMayuscula;
        } else {
            return false;
        }
    }
}
