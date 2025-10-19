import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int data;
        int dm, um, cen, dec, uni;

        Scanner scr = new Scanner(System.in);

        do {
            System.out.println("Introduce un número de 5 dígitos");
            data = scr.nextInt();
            if (data <=0 || data > 99999){
                System.out.println("Valor no admitido...");
            }
        } while (data <=0 || data > 99999);

        //OPERAR
        uni =data%10;
        dec =(data/10)%10;
        cen =(data/100)%10;
        um = (data/1000)%10;
        dm = data / 10000;

        System.out.println("Decenas de mil: " + dm);
        System.out.println("Unidades de mil: " + um);
        System.out.println("Centenas: " + cen);
        System.out.println("Decenas: " + dec);
        System.out.println("Unidades: " + uni);
        System.out.println("Número introducido: " + data);

    }
}
