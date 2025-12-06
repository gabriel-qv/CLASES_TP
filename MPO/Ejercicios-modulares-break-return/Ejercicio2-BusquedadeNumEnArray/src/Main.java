import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numerosMain = new int[]{1,2,5,4,6,7,12,29,7,8};
        int objetivo;
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingresa el número a buscar");
        objetivo = scr.nextInt();
        System.out.println("La ubicacion del número a buscar dentro del array:");
        System.out.println(buscarNumero(numerosMain,objetivo));
    }
    public static int buscarNumero(int[] numerosArray, int objetivoBuscar){
        int ubicacion = -1;
        for (int i = 0; i < numerosArray.length; i++) {
            if (objetivoBuscar == numerosArray[i]){
                ubicacion = i;
            }
        }
        return ubicacion;
    }
}
