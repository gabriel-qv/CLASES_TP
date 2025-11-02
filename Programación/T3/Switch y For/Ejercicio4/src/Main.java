import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rpta;
        String seleccion;
        Scanner scr = new Scanner(System.in);

        System.out.println("""
                ------ MENÚ ------
                1. Ver perfil
                2. Configuración
                3. Ayuda
                4. Salir
                """);
        rpta = scr.nextInt();
        switch (rpta){
            case 1:
                seleccion = "Ver perfil";
                break;
            case 2:
                seleccion = "Configuración";
                break;
            case 3:
                seleccion = "Ayuda";
                break;
            case 4:
                seleccion = "Salir";
                break;
            default:
                seleccion = "No válido";
                break;
        }
        System.out.println("Has seleccionado: " + seleccion);
    }
}
