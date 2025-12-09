import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numAum;
        System.out.println("Ingresa el número de alumnos");
        numAum = scr.nextInt();

        double[] notaAlumnos = new double[numAum];
        for (int i = 0; i < numAum; i++) {
            do{
                System.out.println("Ingresa la nota del alumno " + (i+1));
                notaAlumnos[i] = scr.nextDouble();
            } while (notaAlumnos[i] < 0 || notaAlumnos[i] > 10);
        }

        System.out.println("Nota más alta: " + Arrays.stream(notaAlumnos).max().getAsDouble());
        System.out.println("Nota más baja: " + Arrays.stream(notaAlumnos).min().getAsDouble());
        double suma = 0;
        int aprobados = 0;
        for (double item : notaAlumnos){
            suma+=item;
            if (item>=5){
                aprobados++;
            }
        }
        double promedio = suma/ notaAlumnos.length;

        System.out.println("El promedio es: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + (notaAlumnos.length-aprobados));





    }
}
