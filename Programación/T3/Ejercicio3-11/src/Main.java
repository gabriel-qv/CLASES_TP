import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double precioInicial;
        double precioFinal = 0;
        double descuento = 0;
        String respuesta;
        boolean socio;
        Scanner scr = new Scanner(System.in);

        do {
            System.out.println("Ingrese el precio a pagar:");
            precioInicial = scr.nextDouble();

            if (precioInicial <= 0){
                System.out.println("Ingresa un valor válido");
            }
        } while (precioInicial <= 0);

        System.out.println("¿Eres socio? (true/false)");
        socio = scr.nextBoolean();

         if (precioInicial >= 200){
             if (socio){
                 descuento = 0.2*precioInicial;
                 precioFinal = precioInicial - descuento;
                 System.out.println("Descuento del 20%");
                 System.out.printf("Eres socio y tu pago inicial es de: %.2f %n", precioInicial);
             } else {
                 if (precioInicial >= 300){
                     descuento = 0.05*precioInicial;
                     precioFinal = precioInicial - descuento;
                     System.out.println("Descuento del 5%");
                     System.out.printf("No eres socio y tu pago inicial es de: %.2f %n", precioInicial);
                 } else {
                     System.out.println("No se aplica descuento");
                     descuento = 0;
                     precioFinal = precioInicial;
                     System.out.printf("No eres socio y tu pago inicial es de: %.2f %n", precioInicial);
                 }
             }
         } else if (precioInicial <= 200) {
             if (socio){
                 descuento = 0.1*precioInicial;
                 precioFinal = precioInicial - descuento;
                 System.out.println("Descuento del 10%");
                 System.out.printf("Eres socio y tu pago inicial es de: %.2f %n", precioInicial);
             } else {
                 System.out.println("No se aplica descuento");
                 descuento = 0;
                 precioFinal = precioInicial;
                 System.out.printf("No eres socio y tu pago inicial es de: %.2f %n", precioInicial);
             }
         }

        System.out.printf("Descuento aplicado: %.2f %n", descuento);
        System.out.printf("Pago final: %.2f", precioFinal);
    }
}
