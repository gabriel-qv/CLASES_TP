import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double suma = 0, promedio;
        Scanner scr = new Scanner(System.in);

        System.out.println("Cantidad de notas a ingresar:");
        int cantidad = scr.nextInt();
        double[] notas = new double[cantidad];
        int i = 0;

        while (i < cantidad){
            System.out.println("Ingrese la nota " + (i+1) + ": ");
            notas[i] = scr.nextDouble();
            suma += notas[i];
            i++;
        }
        scr.nextLine();
        //se come el salto de linea, es decir el ENTER, asi no se lo come el nextLine de rpta

        promedio = suma/cantidad;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        System.out.println("¿Quieres consultar las notas? (si/no)");
        String rpta = scr.nextLine().trim();
        switch (rpta.toLowerCase()){
            case "si"->{
                System.out.println("Ingresaste " + cantidad + " calificaciones:");
                int consulta;
                do {
                    System.out.println("¿Cuál quieres consultar? (Press 0 para salir)");
                    consulta = scr.nextInt();
                    if (consulta<=cantidad && consulta>0){
                        System.out.println("La calificación " + consulta + " es: " + notas[consulta-1]);
                    } else if (consulta<0 || consulta>cantidad){
                        System.out.println("Solo ingresaste " + cantidad + " notas.");
                    } else {
                        System.out.println("Saliendo...");
                    }
                } while (consulta != 0);
            }
            case "no"->{
                System.out.println("Saliendo...");
            }
            default -> {
                System.out.println("Ingresa una opción válida.");
            }
        }


    }
}
