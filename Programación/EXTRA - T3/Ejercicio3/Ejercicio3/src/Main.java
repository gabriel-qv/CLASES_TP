import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Mostrar menú: queso10 - jamon15 - piña8- tomate6 -pepperoni12
    // max 5 ingredientes
    //cada ingrediente aumenta el costo total y SE MUESTRA
    //mostrar lista de ingredientes y subtotal por cada eleccion
    //finalmente mostrar ingredientes finales y precio total
        int eleccion, total=0;
        ArrayList pizza = new ArrayList<>();
        Scanner scr = new Scanner(System.in);
        do{
            System.out.println("""
                === DOMINOS'S PIZZA ===
                ---- INGREDIENTES ----
                1. Queso - 10€
                2. Jamón - 15€
                3. Piña - 8€
                4. Tomate - 6€
                5. Pepperoni - 12€
                """);
            eleccion = scr.nextInt();
            switch (eleccion){
                case 1->{
                    pizza.add(Ingrediente.Queso);
                    total += Ingrediente.Queso.precio;
                }
                case 2->{
                    pizza.add(Ingrediente.Jamon);
                    total += Ingrediente.Jamon.precio;
                }
                case 3->{
                    pizza.add(Ingrediente.Piña);
                    total += Ingrediente.Piña.precio;
                }
                case 4->{
                    pizza.add(Ingrediente.Tomate);
                    total += Ingrediente.Tomate.precio;
                }
                case 5->{
                    pizza.add(Ingrediente.Pepperoni);
                    total += Ingrediente.Pepperoni.precio;
                }
                default -> {
                    System.out.println("Ingresa una opción válida");
                }
            }

            System.out.println("Ingredientes añadidos: ");
            for (int i = 0; i < pizza.size(); i++) {
                System.out.println(" - " + pizza.get(i));
            }
            System.out.println("Subtotal: " + total);

        } while (pizza.size()<5);

        System.out.println("Ingredientes FINALES:");
        for (int i = 0; i < pizza.size(); i++) {
            System.out.println(" - " + pizza.get(i));
        }
        System.out.println("------------");
        System.out.println("Total compra: " + total);


    }
}
