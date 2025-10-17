import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double numero1, numero2;
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        numero1 = scr.nextDouble();
        System.out.println("Ingrese el segundo valor");
        numero2 = scr.nextDouble();

        Comparación comp = new Comparación();

        System.out.println("¿El " + numero1 + " es mayor que " + numero2 + "?:" + comp.mayor(numero1,numero2));
        System.out.println("¿El " + numero1 + " es menor que " + numero2 + "?: " + comp.menor(numero1,numero2));
        System.out.println("¿El " + numero1 + " es igual que " + numero2 + "?: " + comp.igual(numero1,numero2));
        System.out.println("¿El " + numero1 + " es diferente que " + numero2 + "?: " + comp.diferente(numero1,numero2));
        System.out.println("¿El " + numero1 + " es mayor o igual que " + numero2 + "?: " + comp.mayorigual(numero1,numero2));
        System.out.println("¿El " + numero1 + " es menor o igual que " + numero2 + "?: " + comp.menorigual(numero1,numero2));

    }
}
