import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperatura;
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingresa la temperatura actual:");
        temperatura = scr.nextInt();

        AnalisisTemp enumCreado = AnalisisTemp.metodoMensaje(temperatura);
        System.out.println(enumCreado.getMensaje());


    }
}
