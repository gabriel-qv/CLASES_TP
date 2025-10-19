import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    int bebidas, bocadillos, alumnos;
    float precioBebidas = 0;
    float precioBocadillos = 0;
    float totalCompra, subBebidas, subBocadillos, pagoAlumno;

        Scanner scr = new Scanner(System.in);


        //BEBIDAS
        do {
            System.out.println("Ingrese el número de bebidas (mín. 0, máx. 20):");
            bebidas = scr.nextInt();
            if (bebidas < 0 || bebidas > 20) {
                System.out.println("Valor inválido, inténtelo de nuevo.");
            }
        } while (bebidas < 0 || bebidas > 20);
        //PRECIO BEBIDAS
        if (bebidas == 0){
            System.out.println("No se le pedirá el precio de las bebidas");
        } else if (bebidas >= 1 && bebidas <= 20){
            do {
                System.out.println("Ingrese el precio de las bebidas (máx. 3.00):");
                precioBebidas = scr.nextFloat();
                if (precioBebidas == 0 || precioBebidas > 3) {
                    System.out.println("Valor inválido, inténtelo de nuevo.");
                }
            } while (precioBebidas == 0 || precioBebidas > 3);
        }

        //BOCADILLOS
        do {
            System.out.println("Ingrese el número de bocadillos (mín. 0, máx. 20):");
            bocadillos = scr.nextInt();
            if (bocadillos < 0 || bocadillos > 20) {
                System.out.println("Valor inválido, inténtelo de nuevo.");
            }
        } while (bocadillos < 0 || bocadillos > 20);
        //PRECIO BOCADILLOS
        if (bocadillos == 0){
            System.out.println("No se le pedirá el precio de los bocadillos");
        } else if (bocadillos >= 1 && bocadillos <= 20){
            do {
                System.out.println("Ingrese el precio de los bocadillos (máx. 5.00):");
                precioBocadillos = scr.nextFloat();
                if (precioBocadillos == 0 || precioBocadillos > 5) {
                    System.out.println("Valor inválido, inténtelo de nuevo.");
                }
            } while (precioBocadillos == 0 || precioBocadillos > 5);
        }

        //Número de alumnos
        System.out.println("Ingrese el número de alumnos:");
        alumnos = scr.nextInt();

        //OPERAR
        subBebidas = precioBebidas*(float) bebidas;
        subBocadillos = precioBocadillos*(float) bocadillos;
        totalCompra = subBocadillos + subBebidas;
        pagoAlumno = totalCompra/(float)alumnos;

        //MOSTRAR
        System.out.printf("Num. bebidas: %d Precio por unidad: %.2f %n", bebidas, precioBebidas);
        System.out.printf("Num. bocadillos: %d Precio por unidad: %.2f %n", bocadillos, precioBocadillos);
        System.out.printf("Num. alumnos: %d %n", alumnos);
        System.out.printf("%nPrecio total bebidas: %.2f %n", subBebidas);
        System.out.printf("Precio total bocadillos: %.2f %n", subBocadillos);
        System.out.printf("Total de la compra: %.2f %n", totalCompra);
        System.out.printf("Pago por alumno: %.2f", pagoAlumno);


    }
}

