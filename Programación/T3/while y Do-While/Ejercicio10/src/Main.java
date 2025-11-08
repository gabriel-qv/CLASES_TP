import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 1000;
        int rpta;
        int pin = 1234;
        Scanner scr = new Scanner(System.in);
        ClaseValidarPin validacion = new ClaseValidarPin();
        boolean[] retornoDeClaseValidar = validacion.metodoValidarPin(pin);

        if (!retornoDeClaseValidar[1]){
            do{
                System.out.println("""
                    ---- MENÚ - CAJERO AUTOMÁTICO -----
                    1. 
                    2.
                    3.
                    4.
                    
                    """);
            } while (pin<0);
        } else {
            System.out.println("Fin de programa...");
        }
    }
}