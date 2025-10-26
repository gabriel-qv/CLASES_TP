import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad, respuesta;
        Scanner scr = new Scanner(System.in);

        do {
            System.out.println("Ingrese su edad");
            edad = scr.nextInt();
            if (edad <= 0){
                System.out.println("Ingrese una respuesta válida");
            }
        } while (edad <= 0);

        System.out.println("Ingrese el día de la semana que asistirá:");
        System.out.println("""
                1. Lunes
                2. Martes
                3. Miércoles
                4. Jueves
                5. Viernes
                6. Sábado
                7. Domingo
                """);
        respuesta = scr.nextInt();

        Entradas edades = new Entradas();
        edades.buleanos(edad);
        edades.precios(respuesta);

        System.out.println("Precio de entrada final: " + edades.precioFinal + "€");


    }
}
