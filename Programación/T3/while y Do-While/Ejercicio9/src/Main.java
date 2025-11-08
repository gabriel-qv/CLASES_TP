import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidad, conteo = 0;
        Scanner scr = new Scanner(System.in);

        do{
            System.out.println("¿Cuántos estudiantes hay?");
            cantidad = scr.nextInt();
            if (cantidad<=0){
                System.out.println("Introduce un valor válido");
            }
        } while (cantidad<=0);
        double[] notas = new double[cantidad];

        while (conteo < cantidad){
            System.out.println("Ingresa la nota del estdiante " + (conteo+1)+ ":");
            notas[conteo] = scr.nextDouble();
            if (notas[conteo]<0 || notas[conteo]>10){
                System.out.println("Ingrese una nota válida. (0-10)");
            } else {
                conteo++;
            }
        }

        String notaLetra;
        for (int i = 0; i < cantidad; i++) {
            switch ((int)notas[i]){
                case 0,1,2->{
                    notaLetra = "F";
                }
                case 3,4->{
                    notaLetra = "D";
                }
                case 5,6->{
                    notaLetra = "C";
                }
                case 7,8->{
                    notaLetra = "B";
                }
                case 9->{
                    notaLetra = "A";
                }
                default ->{
                    notaLetra = "A+";
                }
            }
            System.out.println("Estudiante " + (i+1) + ": " + notas[i] + " puntos = Calificación " + notaLetra);
        }


    }
}
