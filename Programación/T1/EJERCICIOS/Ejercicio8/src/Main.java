import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        String respuesta;
        Scanner scn = new Scanner(System.in);
        double val1, val2;

        System.out.println("¿Qué área quieres calcular? " +
                "\n1.Cuadrado \n2.Rectangulo \n3.Triángulo \n4.Circulo");
        respuesta = scn.nextLine().trim();

        Operaciones operar = new Operaciones();

        if (respuesta.equals("1")){
            System.out.println("Medida del lado:");
            val1 = scn.nextInt();

            operar.cua(val1);

        } else if (respuesta.equals("2")) {
            System.out.println("Medida de la base:");
            val1 = scn.nextInt();

            System.out.println("Medida de la altura:");
            val2 = scn.nextInt();

            operar.rec(val1, val2);

        } else if (respuesta.equals("3")) {
            System.out.println("Medida de la base:");
            val1 = scn.nextInt();

            System.out.println("Medida de la altura:");
            val2 = scn.nextInt();

            operar.tri(val1, val2);

        } else if (respuesta.equals("4")) {
            System.out.println("Medida del radio:");
            val1 = scn.nextInt();

            operar.cir(val1);

        } else {
            System.out.println("Ingrese una opción correcta");
        }

    }
}
