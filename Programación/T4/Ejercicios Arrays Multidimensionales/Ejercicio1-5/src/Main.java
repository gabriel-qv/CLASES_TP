import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static void ejercicio1(){
        int[][] matriz = new int[4][6];
        int valorMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                valorMatriz++;
                matriz[i][j] = valorMatriz;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void ejercicio2(){
        Scanner scr = new Scanner(System.in);
        int[][] matriz2 = new int[3][4];
        int valorMatriz;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Ingresa el número");
                valorMatriz = scr.nextInt();
                matriz2[i][j] = valorMatriz;
            }
        }
        for (int[] fila : matriz2) {
            for (int item : fila) {
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
    public static void ejercicio3(){
        int[][] matriz = new int[4][4];
        int valorMatriz = 0, suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                valorMatriz++;
                matriz[i][j] = valorMatriz;
                System.out.print(matriz[i][j]+" ");
                suma+=valorMatriz;
            }
            System.out.println();
        }
        System.out.println("La suma total es de: " + suma);
    }
    public static void ejercicio4(){
        int[][] matriz = new int[3][5];
        Scanner scr = new Scanner(System.in);
        int valorMatriz = 0, buscar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                valorMatriz++;
                matriz[i][j] = valorMatriz;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("¿Qué número deseas buscar?");
        buscar = scr.nextInt();
        int fila = -1, columna = -1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==buscar){
                    fila = i;
                    columna = j;
                    break;
                }
            }
        }

        if (fila == -1 || columna == -1){
            System.out.println("El número no se encuentra");
        } else {
            System.out.println("El número se encuentra en la fila " + fila + " y en la columna " + columna);
        }
    }
    public static void ejercicio5(){
        double[][] matriz = new double[][]{{5.5, 7.2, 6.8}, {8.1,9.3,7.5}, {4.2, 5.6, 6.1}, {7.8, 8.9, 9.2}};
        double suma = 0, promedio;
        int filaF = -1;
        for (double[] fila : matriz) {
            filaF++;
            suma = 0;
            for (double item : fila) {
                System.out.print(item + " ");
                suma += item;
            }
            System.out.println("Promedio de fila " + (filaF) + ": " + (promedio = suma / fila.length));
        }
    }

}
