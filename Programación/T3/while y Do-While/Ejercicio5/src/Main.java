import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner scr = new Scanner(System.in);

        do{
            System.out.println("""
                ---- MENÚ ----
                1. Saludar
                2. Despedirse
                3. Día y hora
                4. Salir
                """);
            opcion = scr.nextInt();
        switch (opcion){
            case 1 ->{
                System.out.println("¡Hola!¿Qué tal?");
            }
            case 2 ->{
                System.out.println("¡Adios!");
            }
            case 3 ->{
                System.out.println("Fecha y hora actual: " + LocalDateTime.now().format(formatHora));
            }
            case 4 ->{
                System.out.println("Saliendo...");
            }
            default -> {
                System.out.println("Ingresa una opción válida");
            }
        }
        } while (opcion!=4);
    }
}
