package controller;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Agenda {
    private ArrayList<Object[]> listaContactos;

    public Agenda(){
        listaContactos = new ArrayList<>();
    }

    public void agregarContacto(Object[] contacto){
        listaContactos.add(contacto);
        System.out.println("Agregado correctamente");
    }

    public void buscarContacto(String dni){
        for (Object[] contacto : listaContactos) {
            if (dni.equals(contacto[2])){
                System.out.println("Contacto encontrado");
                System.out.println("\t Nombre: " + contacto[0]);
                System.out.println("\t Apellido: " + contacto[1]);
                System.out.println("\t DNI: " + contacto[2]);
                System.out.println("\t Correo electrónico: " + contacto[3]);
                System.out.println("\t Telefono: " + contacto[4]);
                return;
            } else if (contacto[2].toString().contains(dni)) {
                System.out.println("Contacto similar: ");
                System.out.println("\t Nombre y apellido: " + contacto[0] + ", " + contacto[1]);
                System.out.println("\t DNI: " + contacto[2]);
            }
        }
        System.out.println("Contacto no existente. \n");
    }

    public void eliminarContacto(String dni){
        if (listaContactos.isEmpty()){
            System.out.println("La lista de contactos está vacía");
        } else {
            boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
                @Override
                public boolean test(Object[] objects) {
                    return objects[2].equals(dni);
                }
            });

            if (borrado){
                System.out.println("Contacto borrado correctamente.");
            } else {
                System.out.println("Contacto no encontrado.");
            }
        }

    }

    public void mostrarLista(){
        if (listaContactos.isEmpty()){
            System.out.println("Sin contactos existentes");
        } else {
            for (Object[] contacto : listaContactos) {
                System.out.printf("Nombre %s \t Apellido: %s%n", contacto[0], contacto[1]);
                System.out.println("DNI: " + contacto[2]);
                System.out.println("Correo: " + contacto[3]);
                System.out.println("Telefono: " + contacto[4]);
                System.out.println("=================================");
            }
        }
    }

    public ArrayList<Object[]> getListaContactos() {
        return listaContactos;
    }
}
