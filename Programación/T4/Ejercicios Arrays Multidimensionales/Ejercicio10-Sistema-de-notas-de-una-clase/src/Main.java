import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static double[][] notas = new double[1][1];
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("¿Cuántos estudiantes hay?: ");
        int filas = scr.nextInt();

        System.out.println("¿Cuántas asignaturas hay?: ");
        int columnas = scr.nextInt();

        setFilasColumnas(filas, columnas);
        definirNotas();
        tablaNotas();
        promediosEstudiante();
        promediosAsignatura();
        notaMasAlta();
    }

    public static void setFilasColumnas(int alumno, int asignatura){
        notas = new double[alumno][asignatura];
    }

    public static void definirNotas(){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas del estudiante " + (i+1));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Asignatura " + (j+1) + ": ");
                notas[i][j] = scr.nextDouble();
            }
            System.out.println("--------------");
        }
    }

    public static void tablaNotas(){
        System.out.println("---- Tabla de notas ----");
        System.out.printf("\t\t");
        for (int i = 0; i < (notas[0].length); i++) {
            System.out.printf("Asig %d\t",(i+1));
        }
        System.out.println();

        int est = 1;
        for (double[] filas : notas) {
            System.out.printf("Est %d \t",(est++));
            for (double columna : filas) {
                System.out.printf("%.2f \t",columna);
            }
            System.out.println();
        }
    }

    public static void promediosEstudiante(){
        ArrayList<Double> promedios = new ArrayList<Double>();
        int est = 0;
        System.out.println("---- Promedios por estudiante ----");
        for (double[] fila : notas) {
            double suma = 0;
            for (double columna : fila) {
                suma+=columna;
            }
            promedios.add(suma/notas[0].length);
            est++;
            System.out.printf("Estudiante %d: %.2f \n", est, promedios.get(est-1));
        }
    }

    public static void promediosAsignatura(){
        ArrayList<Double> promedios = new ArrayList<Double>();
        int asig = 0;
        System.out.println("---- Promedios por asignatura ----");
        for (int i = 0; i < notas[0].length; i++) {
            double suma = 0;
            for (int j = 0; j < notas.length; j++) {
                suma+=notas[j][i];
            }
            promedios.add(suma/notas.length);
            asig++;
            System.out.printf("Asignatura %d: %.2f \n", asig, promedios.get(asig-1));
        }
    }

    public static void notaMasAlta(){
        double data = 0;
        int est = -1, asig = -1;

        System.out.println("---- Nota más alta ----");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (data<notas[i][j]){
                    data = notas[i][j];
                    est = i+1;
                    asig = j+1;
                }
            }
        }

        System.out.println("La nota más alta es: " + data + " (Estudiante " + est + ", Asignatura " + asig +")");


    }

}
