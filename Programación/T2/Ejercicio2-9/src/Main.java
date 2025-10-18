import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        float not1, not2, not3, promedio;
        Scanner scr = new Scanner(System.in);
        boolean aprobado, notable, sobresaliente;

        System.out.println("Ingrese la primera nota");
        not1 = scr.nextFloat();

        System.out.println("Ingrese la segunda nota");
        not2 = scr.nextFloat();

        System.out.println("Ingrese la tercera nota");
        not3 = scr.nextFloat();

        promedio = (not1+not2+not3)/3;

        aprobado = promedio>=5;
        notable = promedio>=7;
        sobresaliente = promedio>=9;

        System.out.println("Nota media: " + promedio);
        System.out.println("¿Ha aprobado?: " + aprobado);
        System.out.println("¿Tiene notable?: " + notable);
        System.out.println("¿Tiene sobresaliente?: " + sobresaliente);

        System.out.println("=============================");

        if (sobresaliente = promedio>=9){
            System.out.println("¿Tiene sobresaliente?: " + sobresaliente);
        } else if (notable = promedio>=7) {
            System.out.println("¿Tiene notable?: " + notable);
        } else if (aprobado = promedio>=5){
            System.out.println("¿Ha aprobado?: " + aprobado);
        } else {
            System.out.println("Estas desaprobado");
        }

    }
}
