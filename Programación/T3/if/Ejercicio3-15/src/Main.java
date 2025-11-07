import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int peso, distancia, pesoExcedido, distanciaExcedida;
    float precioTotal = 5;
    float diez = 10;
    float precioUrgencia = 0;
    float precioPeso = 0;
    boolean urgencia = false;
    Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el peso del producto (Entero):");
        peso = scr.nextInt();

        System.out.println("Ingrese la distancia de envio;");
        distancia = scr.nextInt();

        System.out.println("¿Envio URGENTE?");
        urgencia = scr.nextBoolean();

        if (peso > 5){
            pesoExcedido = peso - 5;

            for (int i = 0;  i < pesoExcedido; i++){
                precioPeso += 2;
            }

            System.out.println("Peso excedido: " + pesoExcedido);
            System.out.printf("Coste adicional por peso: %.2f € %n", precioPeso);
            precioTotal = precioTotal + precioPeso;
            System.out.printf("Subtotal actual: %.2f € %n", precioTotal);
        } else {
            precioTotal = 5;
            System.out.printf("Subtotal: %.2f € (Sin exceso de peso) %n", precioTotal);
        }

        if (distancia > 100){
            distanciaExcedida = distancia - 100;
            System.out.println("Distancia excedida: " + distanciaExcedida);
            System.out.printf("Coste adicional por distancia: %.2f € %n", diez);
            precioTotal = precioTotal + diez;
            System.out.printf("Subtotal actual: %.2f € %n", precioTotal);
        } else {
            System.out.printf("Subtotal actualizado: %.2f € (Sin exceso de distancia) %n", precioTotal);
        }

        if (urgencia){
            precioUrgencia = precioTotal*0.5f;
            System.out.println("Recargo por URGENCIA (x1.5): " + precioUrgencia);
            precioTotal = precioTotal + precioUrgencia;
        }

        System.out.printf("Precio final: %.2f € %n", precioTotal);

    }
}
