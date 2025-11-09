import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double calificacionNum;
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingresa tu nota:");
        calificacionNum = scr.nextDouble();

        switch ((int)calificacionNum){
            case 0,1,2,3->{
                    System.out.println("Tu calificación (" + calificacionNum + ") es un(a): " + ConversorCalificacion.F.name());
                    System.out.println(ConversorCalificacion.F.mensaje);
            }
            case 4->{
                System.out.println("Tu calificación (" + calificacionNum + ") es un(a): " + ConversorCalificacion.D.name());
                System.out.println(ConversorCalificacion.D.mensaje);
            }
            case 5,6->{
                System.out.println("Tu calificación (" + calificacionNum + ") es un(a): " + ConversorCalificacion.C.name());
                System.out.println(ConversorCalificacion.C.mensaje);
            }
            case 7,8->{
                System.out.println("Tu calificación (" + calificacionNum + ") es un(a): " + ConversorCalificacion.B.name());
                System.out.println(ConversorCalificacion.B.mensaje);
            }
            case 9,10->{
                System.out.println("Tu calificación (" + calificacionNum + ") es un(a): " + ConversorCalificacion.A.name());
                System.out.println(ConversorCalificacion.A.mensaje);
            }
            default -> System.out.println("Ingresa una nota válida");
        }
    }
}
