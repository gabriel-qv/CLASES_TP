import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] matriz = new int[10];
        for (int j = 0; j < matriz.length; j++) {
            matriz[j] = (int) (Math.random()*20+1);
            System.out.print(matriz[j]+"\t");
        }
        int rpta = 0;
        do{
            System.out.println();
            System.out.println("=== MENÚ ===");
            System.out.println("""
                1. Imprimir array
                2. Mover a izquierda
                3. Mover a derecha
                4. Invertir
                5. Salir
                """);
            rpta = scr.nextInt();
            switch (rpta){
                case 1->{
                    for (int i : matriz) {
                        System.out.print(i + "\t");
                    }
                }
                case 2->{
                    int almacen = matriz[0];
                    for (int i = 0; i < matriz.length-1; i++) {
                        matriz[i] = matriz[i+1];
                    }
                    matriz[matriz.length-1] = almacen;
                }
                case 3->{
                    int almacen = matriz[matriz.length-1];
                    for (int i = matriz.length-1; i > 0; i--) {
                        matriz[i] = matriz[i-1];
                    }
                    matriz[0] = almacen;
                }
                case 4->{
                    int almacen = 0;
                    int ultimo = matriz.length-1;
                    for (int i = 0; i < matriz.length/2; i++) {
                        almacen = matriz[i];
                        matriz[i] = matriz[ultimo];
                        matriz[ultimo] = almacen;
                        ultimo--;
                    }
                }
                case 5-> System.out.println("Saliendo...");
                default -> System.out.println("Ingresa una opción válida");
            }
        } while (rpta!=5);
    }
}
