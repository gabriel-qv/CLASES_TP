import java.util.ArrayList;
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
            ArrayList<Integer> retiros = new ArrayList<>();
            ArrayList<Double> depositos = new ArrayList<>();
            do{
                System.out.println("""
                    ---- MENÚ - CAJERO AUTOMÁTICO -----
                    1. Consultar saldo
                    2. Retirar dinero
                    3. Depositar dinero
                    4. Historial de acciones
                    5. Cambiar pin
                    6. Salir
                                     """);
                rpta = scr.nextInt();
                switch (rpta){
                    case 1->{
                        System.out.printf("Saldo Actual: %.2f€ %n", saldo);
                    }
                    case 2->{
                        boolean repetirRetiro = true;
                        int cantidad;
                        do{
                            System.out.println("--- RETIRE DINERO ---");
                            if (validacion.validarAccion(pin)){
                                System.out.println("Saldo actual: " + saldo + "€");
                                System.out.println("Presione 0 para salir.");
                                cantidad = scr.nextInt();
                                if (cantidad<=saldo && cantidad > 0){
                                    saldo -= (double)cantidad;
                                    retiros.add(cantidad);
                                    System.out.println("Retirando " + cantidad + "€...");
                                    repetirRetiro = false;
                                } else if (cantidad == 0) {
                                    System.out.println("Cancelando retiro...");
                                    repetirRetiro = false;
                                } else {
                                    System.out.println("Cantidad inválida.");
                                }
                            } else {
                                System.out.println("Cancelando operación...");
                                repetirRetiro = false;
                            }
                        } while (repetirRetiro);
                    }
                    case 3->{
                        boolean repetirDeposito = true;
                        double cantidad;
                        do{
                            System.out.println("--- DEPOSITE DINERO ---");
                            System.out.println("Saldo actual: " + saldo + "€");
                            System.out.println("Presione 0 para salir.");
                            cantidad = scr.nextDouble();
                            if (cantidad>0){
                                saldo += cantidad;
                                depositos.add(cantidad);
                                System.out.println("Depositando " + cantidad + "€...");
                                repetirDeposito = false;
                            } else if (cantidad == 0) {
                                System.out.println("Cancelando deposito...");
                                repetirDeposito = false;
                            } else {
                                System.out.println("Cantidad inválida.");
                            }
                        } while (repetirDeposito);
                    }
                    case 4->{
                        System.out.println("""
                                --- MENÚ - HISTORIAL ---
                                1. Historial completo
                                2. Historial depositos
                                3. Historial retiros
                                """);
                        rpta = scr.nextInt();
                        switch (rpta){
                            case 1->{
                                System.out.println(" 4");
                            }
                            case 2->{
                                System.out.println(" 1");
                            }
                            case 3->{
                                System.out.println(" 3");
                            }
                            default->{
                                System.out.println(" ");
                            }
                        }

                    }
                    case 5->{
                        System.out.println("Cer Menú.");
                    }
                    case 6->{
                        System.out.println("Cerrando Menú.");
                    }
                    default -> {
                        System.out.println("Ingresa una opción válida");
                    }
                }
            } while (rpta !=6);
        } else {
            System.out.println("Fin de programa...");
        }
    }
}