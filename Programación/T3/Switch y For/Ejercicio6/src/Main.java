import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tablaInicio, tabblaFinal, rangoFinal;
        int resultado;
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese desde que tabla quiere iniciar");
        tablaInicio = scr.nextInt();

        System.out.println("Ingrese hasta que tabla desea");
        tabblaFinal = scr.nextInt();

        System.out.println("Rango de mutiplicación");
        rangoFinal = scr.nextInt();

        for (int i = tablaInicio; i <= tabblaFinal; i++) {
            System.out.println("======= Tabla del " + tablaInicio + " =======");
            for (int j = 0; j <= rangoFinal; j++) {
                resultado = tablaInicio * j;
                System.out.println(tablaInicio + " * " + j + " = " + resultado);
            }
            tablaInicio ++;
        }

    }
}
