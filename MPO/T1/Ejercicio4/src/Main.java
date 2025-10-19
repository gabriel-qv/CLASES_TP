import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int data, horas, minutos, segundos, dias;

        Scanner scr = new Scanner(System.in);

        System.out.println("Introduzca el número de segundos totales para su conversión:");
        data = scr.nextInt();

        //OPERAR
        dias = data/86400;
        horas = (data%86400)/3600;
        minutos = (data%3600)/60;
        segundos = (data%3600)%60;

        //MOSTRAR
        System.out.println("Segundos introducidos: " + data);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

    }
}
