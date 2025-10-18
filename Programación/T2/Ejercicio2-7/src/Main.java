import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int edad;
        String rpt;
        boolean student = true;
        boolean joven, especial;

        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa tu edad:");
        edad = scr.nextInt();
        System.out.println("¿Eres estudiante? (si/no)");
        rpt = scr.next().toLowerCase();

        if (rpt.equals("si") || rpt.equals("sí")){
            student = true;
        } else if (rpt.equals("no")){
            student = false;
        } else {
            System.out.println("Ingresa una respuesta correcta");
        }

        joven = edad<26;
        especial = edad<26 && student;

        System.out.println("Edad: " + edad);
        System.out.println("¿Eres estudiante?: " + student);
        System.out.println("¿Menor de 26 años?: " + joven);
        System.out.println("¿NO eres estudiante?: " + !student);
        System.out.println("¿Tienes descuento joven?: " + joven);
        System.out.println("¿Tienes descuento estudiante?: " + student);
        System.out.println("¿Tienes descuento especial?: " + especial);

    }
}
