import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //escribe el metodo correspondiente al ejercicio que quieres ver
    }

    public static void ejercicio1(){
        String[] frutas = new String[]{"Manzana", "Plátano", "Naranja", "Fresa", "Uva"};
        for (String item : frutas) {
            System.out.println(item);
        }
        System.out.println("===================");
        for (int i = 0; i <frutas.length ; i++) {
            System.out.println(frutas[i]);
        }
    }

    public static void ejercicio2(){
        Random random = new Random();
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*59+1);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    public static void ejercicio3(){
        Scanner scr3 = new Scanner(System.in);
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nomnbre " + (i+1) + ": ");
            nombres[i] = scr3.nextLine();
        }
        for (String item : nombres){
            System.out.println(item);
        }
    }

    public static void ejercicio4(){
        int[] numeros = new int[]{5, 12, 8, 3, 15, 9, 6, 5};
        int numBuscar;
        Scanner scr4 = new Scanner(System.in);
        System.out.println("Introduce el número a buscar: ");
        numBuscar = scr4.nextInt();
        boolean encontrado=false;
        for (int i = 0; i < numeros.length; i++) {
            if (numBuscar == numeros[i]){
                System.out.println("El número " + numBuscar + " se encuentra en la posición " + i);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("El número " + numBuscar + " no se encuentra en el array");
        }
    }

    public static void ejercicio5(){
        int[] numeros = new int[]{23, 67, 45, 89, 12, 56, 78, 34, 90, 43, 5, 6, 11, 8};
        int barrera = 0, contador = 0, eleccion = 0;
        Scanner scr5 = new Scanner(System.in);
        System.out.println("Introduce el numero:");
        barrera = scr5.nextInt();
        System.out.println("¿Qué quieres encontrar?");
        System.out.println("Mayores(1) o menores(2)");
        eleccion = scr5.nextInt();
        switch (eleccion){
            case 1->{
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] > barrera){
                        contador++;
                    }
                }
                System.out.println("Números mayores que " + barrera + ": " + contador);
            }
            case 2->{
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] < barrera){
                        contador++;
                    }
                }
                System.out.println("Números menores que " + barrera + ": " + contador);
            }
            default -> System.out.println("Escoge una opción válida");
        }

    }

    public static void ejercicio6(){
        double[] numeros = new double[]{4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};
        double suma = 0, promedio = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        promedio = (suma/ numeros.length);
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

    }

    public static void ejercicio7(){
//METODO UNO
        int[] numeros = new int[]{15, 8, 23, 4, 19, 12};
        int mayor = Arrays.stream(numeros).max().getAsInt();
        System.out.println(mayor);
        int menor = Arrays.stream(numeros).min().getAsInt();
        System.out.println(menor);
// METODO DOS
        int mayor1 = numeros[0];//TOMO EL PRIMER VALOR DEL ARRAY
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>mayor1){//comparo el valor que tenia con el que esta tomando el FOR
                mayor1 = numeros[i];//si el numero que tengo en mayor es menor que el del FOR
            } //se almacena ese nuevo numero mayor en mi variable "mayor1"
        }
        System.out.println(mayor1);
    }

    public static void ejercicio8(){
        String[] animales = new String[]{"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};
        Scanner scr8 = new Scanner(System.in);
        System.out.println("Introduce la palabra a buscar");
        String buscar = scr8.nextLine().trim().toLowerCase();
        boolean encontrado = false;
        int contador = 0;
        for (int i = 0; i < animales.length; i++) {
            if (buscar.equals(animales[i])){
                contador++;
                encontrado = true;
            }
        }
        if (encontrado){
            System.out.println("La palabra " + buscar + " aparece " + contador + " veces en el array.");
        } else {
            System.out.println("La palabra " + buscar + " no aparece en el array.");
        }
    }

    public static void ejercicio9(){
       int[] original = new int[]{2, 4, 6, 8, 10, 12, 14, 25, 30, 50};
       int[] invertido = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length-(i+1)];
        }
        System.out.println("ORIGINAL");
        for (int i : original) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("INVERTIDO");
        for (int i : invertido) {
            System.out.print(i + " ");
        }
    }

    public static void ejercicio10(){
        Scanner scr10 = new Scanner(System.in);
        System.out.println("¿Cuántos estudiantes hay?");
        int numEstudiantes = scr10.nextInt();
        double[] notasEstudiantes = new double[numEstudiantes];
        double suma = 0, promedio = 0;
        int aprobados = 0;

        for (int i = 0; i < numEstudiantes; i++) {
            do{
                System.out.println("Introduce la nota del estudiante " + (i+1) + ": ");
                notasEstudiantes[i] = scr10.nextDouble();
            } while (notasEstudiantes[i]>10 || notasEstudiantes[i]<0);
            suma += notasEstudiantes[i];
            if (notasEstudiantes[i]>=5){
                aprobados ++;
            }
        }
        promedio = (suma/ notasEstudiantes.length);
        System.out.println("--- REPORTE DE CALIFICACIONES ---");
        System.out.println("Promedio de la clase: " + promedio);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes desaprobados: " + (numEstudiantes-aprobados));
        System.out.println("Nota más alta: " + Arrays.stream(notasEstudiantes).max().getAsDouble());
        System.out.println("Nota más baja: " + Arrays.stream(notasEstudiantes).min().getAsDouble());

    }
}
