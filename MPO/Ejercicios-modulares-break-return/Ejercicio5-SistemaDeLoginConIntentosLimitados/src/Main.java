import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario, contrasenha;
        Scanner scr = new Scanner(System.in);
        int intentos = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa tu usuario");
            usuario = scr.nextLine();
            System.out.println("Ingresa tu contraseña");
            contrasenha = scr.nextLine();
            intentos++;
            if (intentarLoguin(usuario,contrasenha)){
                System.out.println("Logueado Correctamente");
                break;
            } else if (intentos == 3){
                System.out.println("Sin intentos restantes");
            }else {
                System.out.println("Error al loguearse. Intente de nuevo.");
            }
        }
    }
    public static boolean intentarLoguin(String usuarioM, String contrasenhaM){
        String usuarioCorrecto = "Cristhian";
        String contrasenhaCorrecta = "123456";
        boolean usuarioValido = false;
        boolean contrasenhaValida = false;
        if (usuarioM.equals(usuarioCorrecto)){
            usuarioValido =true;
        } else {
            usuarioValido = false;
        }
        if (contrasenhaM.equals(contrasenhaCorrecta)){
            contrasenhaValida = true;
        } else {
            contrasenhaValida = false;
        }
        return contrasenhaValida && usuarioValido;
    }
}
