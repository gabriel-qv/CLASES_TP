import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char rpta;
        Scanner scr = new Scanner(System.in);

        System.out.println("Introduce tu calficación (A-F)");
        rpta = scr.next().toUpperCase().charAt(0);

        String cali = null;
        switch (rpta){
            case 'A':
                cali = "Excelente";
                break;
            case 'B':
                cali = "Muy bien";
                break;
            case 'C':
                cali = "Bien";
                break;
            case 'D':
                cali = "Suficiente";
                break;
            case 'F':
                cali = "Insuficiente";
                break;
            default:
                cali = "La calificación ingresada no es admitido";
                break;
        }
        System.out.println("Calificación " + rpta + " = " + cali);
    }
}
