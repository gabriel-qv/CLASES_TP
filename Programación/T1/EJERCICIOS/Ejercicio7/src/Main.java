import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name, apellido, ciudad;
        int year;

        Scanner scn = new Scanner(System.in);

        System.out.println("Nombre completo");
        name = scn.nextLine();

        System.out.println("Apellidos:");
        apellido = scn.nextLine();

        System.out.println("Edad:");
        year = scn.nextInt();
        scn.nextLine(); // limpia el salto de línea pendiente

        System.out.println("Ciudad:");
        ciudad = scn.nextLine();

        System.out.println("¡Hola! Me llamo " + name + " " + apellido + "\nTengo " + year + " y vivo en " + ciudad);

    }
}
