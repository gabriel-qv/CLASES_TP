import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rpta;
        String dia;
        Scanner scr = new Scanner(System.in);

        System.out.println("Escoja un día de la semana para mostrar en pantalla");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sábado");
        System.out.println("7. Domingo");
        rpta = scr.nextInt();

        switch (rpta){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "No tiene valor";
                break;
        }
        System.out.println("La opcion " + rpta + " es equivalente al día: " + dia);

    }
}
