import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float precio, precioFinal, descuento;
        Scanner scr = new Scanner(System.in);
        boolean dscto = true;

        System.out.println("Ingresa el precio a pagar");
        precio = scr.nextFloat();

        if (precio >= 100){
            dscto = true;
            descuento = precio*10/100;
            precioFinal = precio - descuento;
            System.out.printf("Precio incial: %.2f %n", precio);
            System.out.printf("Precio final: %.2f %n", precioFinal);
            System.out.printf("Descuento: %.2f", descuento);
        } else if (precio < 100 && precio > 0){
            dscto = false;
            System.out.println("No se aplica descuento.");
            System.out.printf("Tu precio final es %.2f", precio);
        } else {
            System.out.println("Ingresa un valor correcto");
        }
    }
}
