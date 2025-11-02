import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String estacion;
    int rpta;
    Scanner scr = new Scanner(System.in);

        System.out.println("""
                        Dime el mes actual:
                        1. Enero
                        2. Febrero
                        3. Marzo
                        4. Abril
                        5. Mayo
                        6. Junio
                        7. Julio
                        8. Agosto
                        9. Septiembre
                        10. Octubre
                        11. Noviembre
                        12. Diciembre
                        """);
        rpta = scr.nextInt();
        switch (rpta){
            case 1,2,12:
                estacion = "Invierno";
                break;
            case 3,4,5:
                estacion = "Primavera";
                break;
            case 6,7,8:
                estacion = "Verano";
                break;
            case 9,10,11:
                estacion = "Otoño";
                break;
            default:
                estacion = "NO EXISTE";
                break;
        }
        System.out.println("El mes " + rpta + " corresponde a: " + estacion);


    }
}
