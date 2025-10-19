import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      float precioConIva, precioSinIva, ivaAgregado;
      int iva;

        Scanner scr = new Scanner(System.in);

        //Precio con IVA
        do {
            System.out.println("Ingrese el precio pagado (máx. 500):");
            precioConIva = scr.nextFloat();
            if (precioConIva <= 0 || precioConIva > 500) {
                System.out.println("Valor inválido, inténtelo de nuevo.");
            }
        } while (precioConIva <= 0 || precioConIva > 500);

        //Solicitar IVA
        do {
            System.out.println("Ingrese el IVA (Máx. 25 - solo valores enteros):");
            iva = scr.nextInt();
            if (iva <= 0 || iva > 25) {
                System.out.println("Valor inválido, inténtelo de nuevo.");
            }
        } while (iva <= 0 || iva > 25);

        //OPERAR
        precioSinIva = (precioConIva*100)/(100+(float)iva);
        ivaAgregado = precioSinIva*((float) iva/100);

        //MOSTRAR
        System.out.printf("Valor de la compra: %.2f € %n", precioConIva);
        System.out.printf("IVA: %d", iva);
        System.out.println("%");
        System.out.printf("Compra sin IVA: %.2f € %n", precioSinIva);
        System.out.printf("IVA (€): %.2f €", ivaAgregado);

    }
}
