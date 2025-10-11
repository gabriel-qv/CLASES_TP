import java.util.Scanner;

public class Main {
    /*
    Escribe un programa que almacene la información de un producto
    (nombre, precio, código y disponibilidad) y muestre estos
    datos formateados por consola.
     */
    public static void main (String[] args) {
        String name, code, rpt;
        float price;
        boolean disp = false;

        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto:");
        name = scn.nextLine();

        System.out.println("Ingrese el precio:");
        price = scn.nextFloat();
        scn.nextLine();

        System.out.println("Ingrese su código:");
        code = scn.nextLine();

        System.out.println("¿Esta disponible? (si/no)");
        rpt = scn.next().trim().toLowerCase();

        if (rpt.equals("si")||rpt.equals("sí")){
            disp = true;
        } else if (rpt.equals("no")) {
            disp = false;
        } else {
            System.out.println("Respuesta no válida, se tomara como NO disponible");
        }

        System.out.printf("=============================%n" +
                "INFORMACIÓN DEL PRODUCTO\n" +
                "-----------------------------\n" +
                "%-13s: %s%n" +
                "%-13s: %.2f%n" +
                "%-13s: %s%n" +
                "%-13s: %b%n" +
                "=============================",
                "Nombre", name,
                "Precio", price,
                "Código", code,
                "Disponible", disp);

    }
}
