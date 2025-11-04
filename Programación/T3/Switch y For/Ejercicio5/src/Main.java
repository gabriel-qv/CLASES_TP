import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String estacion;
    int rpta;
    Scanner scr = new Scanner(System.in);

        System.out.println("Dime el mes actual (1.Enero, 2.Febrero.. ...11.Noviembre, 12.Diciembres)");
        rpta = scr.nextInt();
        if (rpta > 0 && rpta < 13){
            switch (rpta){
                case 1,2,12->{
                    estacion = "Invierno";
                }
                case 3,4,5->{
                    estacion = "Primavera";
                }
                case 6,7,8->{
                    estacion = "Verano";
                }
                default ->{
                    estacion = "Otoño";
                }
            }
            System.out.printf("El mes %d corresponde a: %s %n", rpta, estacion);
        } else {
            System.out.println("Introduce un valor válido");
        }


    }
}
