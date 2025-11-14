import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eleccionCategoria, eleccionPlato;
        ArrayList<String> platosFinales = new ArrayList<>();
        Scanner scr = new Scanner(System.in);

        do{
            System.out.println("--- BIENVENIDO AL MENÚ ---");
            System.out.println("""
                1. ENTRADA
                2. PRINCIPAL
                3. POSTRE
                4. BEBIDA
                5. SALIR
                """);
            eleccionCategoria = scr.nextInt();
            switch (eleccionCategoria){
                case 1:
                    System.out.println("--- ENTRADA ---");
                    for (int i = 0; i < CategoriaPlato.ENTRADA.opciones.length; i++) {
                        System.out.println("- " + CategoriaPlato.ENTRADA.opciones[i]);
                    }
                    eleccionPlato = scr.nextInt();
                    platosFinales.add(CategoriaPlato.ENTRADA.opciones[eleccionPlato-1]);
                    break;
                case 2:
                    System.out.println("--- PRINCIPAL ---");
                    for (int i = 0; i < CategoriaPlato.PRINCIPAL.opciones.length; i++) {
                        System.out.println("- " + CategoriaPlato.PRINCIPAL.opciones[i]);
                    }
                    eleccionPlato = scr.nextInt();
                    platosFinales.add(CategoriaPlato.PRINCIPAL.opciones[eleccionPlato-1]);
                    break;
                case 3:
                    System.out.println("--- POSTRE ---");
                    for (int i = 0; i < CategoriaPlato.POSTRE.opciones.length; i++) {
                        System.out.println("- " + CategoriaPlato.POSTRE.opciones[i]);
                    }
                    eleccionPlato = scr.nextInt();
                    platosFinales.add(CategoriaPlato.POSTRE.opciones[eleccionPlato-1]);
                    break;
                case 4:
                    System.out.println("--- BEBIDAS ---");
                    for (int i = 0; i < CategoriaPlato.BEBIDA.opciones.length; i++) {
                        System.out.println("- " + CategoriaPlato.BEBIDA.opciones[i]);
                    }
                    eleccionPlato = scr.nextInt();
                    platosFinales.add(CategoriaPlato.BEBIDA.opciones[eleccionPlato-1]);
                    break;
                case 5:
                    System.out.println("Saliendo del MENÚ");
                    break;
            }
        } while (eleccionCategoria!=5);

        if (platosFinales.isEmpty()){
            System.out.println("No elegiste platos.");
        } else {
            System.out.println("Lista de pedidos:");
            for (int i = 0; i < platosFinales.size(); i++) {
                System.out.println("- " + platosFinales.get(i));
            }
        }

        System.out.println("Finalizando programa");
    }
}
