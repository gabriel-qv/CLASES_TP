import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double altura;
    int eleccion;
    Scanner scr = new Scanner(System.in);

        do {
            System.out.println("Ingrese su altura");
            altura = scr.nextDouble();

            if (altura <= 0){
                System.out.println("Valor inválido. Intente nuevamente.");
            }

            System.out.println("A que atracción desea ir:");
            System.out.println("1. Montaña Rusa “Vértigo Extremo”");
            System.out.println("2. Carrusel “Fantasilandia”");
            System.out.println("3. Tobogán Acuático “Splash Turbo”");
            System.out.println("0. Para salir");
            eleccion = scr.nextInt();

            if (eleccion > 3 || eleccion < 0){
                System.out.println("Ingrese una elección válida");
            }

        } while (altura <= 0 && eleccion > 3 || eleccion < 0);

        if (eleccion == 1){
            System.out.println("Su altura: " + altura);
            System.out.println("Altura mín. 120cm - máx. 200cm");
            if (altura < 120 || altura > 200){
                System.out.println("Acceso denegado.");
            } else {
                System.out.println("Excelente, puede ingresar.");
            }
        } else if (eleccion == 2){
            System.out.println("Su altura: " + altura);
            System.out.println("Altura mín. 90cm - máx. 160cm");
            if (altura < 90){
                System.out.println("Debe ir acompañado por un adulto");
            } else if (altura > 160){
                System.out.println("Acceso denegado.");
            } else {
                System.out.println("Excelente, puede ingresar.");
            }
        } else if (eleccion == 3){
            System.out.println("Su altura: " + altura);
            System.out.println("Altura mín. 120cm - máx. 190cm");
            if (altura < 120 || altura > 190){
                System.out.println("Acceso denegado.");
            } else {
                System.out.println("Excelente, puede ingresar.");
            }
        } else {
            System.out.println("Programa finalizado...");
        }

    }

}
