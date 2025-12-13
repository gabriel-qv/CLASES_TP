import controller.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int rpta;
        Agenda agenda = new Agenda();
        do{
        mostrarMenu();
        rpta = scr.nextInt();
        switch (rpta){
            case 1->{
                System.out.println("Agrega al nuevo contacto... \n");
                System.out.println("Introduce el nombre:");
                String nombre = scr.next();
                System.out.println("Introduce el apellido:");
                String apellido = scr.next();
                System.out.println("Introduce el DNI:");
                String dni = scr.next();
                System.out.println("Introduce el correo electrónico:");
                String correo = scr.next();
                System.out.println("Introduce el tekefono:");
                int telf = scr.nextInt();
                agenda.agregarContacto(new Object[]{nombre, apellido, dni, correo, telf});
            }
            case 2->{
                System.out.println("DNI del contacto ha buscar:");
                String dni = scr.next();
                agenda.buscarContacto(dni);
            }
            case 3->{
                System.out.println("DNI del contacto ha borrar:");
                String dni = scr.next();
                agenda.eliminarContacto(dni);
            }
            case 4-> agenda.mostrarLista();
            case 5-> System.out.println("Saliendo del programa...");
            default-> System.out.println("Selecciona una opción válida");
        }
        } while (rpta != 5);

    }

    public static void mostrarMenu(){
        System.out.println("----- MENÚ -----");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Borrar contacto");
        System.out.println("4. Listar contacto");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opción:");
    }
}
