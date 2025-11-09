import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double euros;
        int rpta;
        Scanner scr = new Scanner(System.in);
        do {
            System.out.println("Cantidad de Euros (Press 0 para salir):");
            euros = scr.nextDouble();
        } while (euros<0);

        if (euros >= 1){
            System.out.println("¿Qué conversión quiere ralizar?");
            System.out.println("""
            1. Dólar
            2. Libra
            3. Yen
            4. Soles
            """);
            rpta = scr.nextInt();
            switch (rpta){
                case 1-> {
                    System.out.println("Euros a Dolares:");
                    System.out.println("Euros: " + euros);
                    System.out.println("Tasa conversion: " + Moneda.DOLAR.getTasaConversion());
                    System.out.println("Dolares totales: " + Moneda.DOLAR.conversionEuros(euros));
                }
                case 2-> {
                    System.out.println("Euros a Libras:");
                    System.out.println("Euros: " + euros);
                    System.out.println("Tasa conversion: " + Moneda.LIBRA.getTasaConversion());
                    System.out.println("Dolares totales: " + Moneda.LIBRA.conversionEuros(euros));
                }
                case 3-> {
                    System.out.println("Euros a Yens:");
                    System.out.println("Euros: " + euros);
                    System.out.println("Tasa conversion: " + Moneda.YEN.getTasaConversion());
                    System.out.println("Dolares totales: " + Moneda.YEN.conversionEuros(euros));
                }
                case 4-> {
                    System.out.println("Euros a Soles:");
                    System.out.println("Euros: " + euros);
                    System.out.println("Tasa conversion: " + Moneda.SOLES.getTasaConversion());
                    System.out.println("Dolares totales: " + Moneda.SOLES.conversionEuros(euros));
                }
                default -> System.out.println("Ingresa una opción válida");
            }
        } else {
            System.out.println("Cancelando operación.");
        }
        System.out.println("Fin de programa...");
    }
}
