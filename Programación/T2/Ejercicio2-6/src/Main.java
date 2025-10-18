import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int dscto;
        float price, priceds,pricefi;

        Scanner scr = new Scanner(System.in);

        System.out.println("Precio del producto:");
        price = scr.nextFloat();
        System.out.println("Porcentaje de descuento");
        dscto = scr.nextInt();

        priceds = ((float)dscto/100)*price;
        pricefi = price - priceds;

        System.out.println("Precio original: " + price + "€");
        System.out.println("Descuento "+"("+dscto+"%): " + priceds + "€");
        System.out.println("Precio final: " + pricefi + "€");

    }
}
