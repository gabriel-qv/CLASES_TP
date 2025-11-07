import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int respuesta, conteo;
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingresa un número para iniciar el conteo");
        respuesta = scr.nextInt();
        conteo = respuesta;
        if (respuesta>0){
            System.out.println("Cuenta atrás:");
            do{
                System.out.println(conteo);
                conteo--;
            } while (conteo!=0);
            System.out.println("¡Despegue!");
        } else {
            System.out.println("Ingresa un número positivo y/o mayor a 0");
        }
    }
}
