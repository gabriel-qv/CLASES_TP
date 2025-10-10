import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Define cinco variables con diferentes
        tipos de datos (String, int, boolean, double, char)
        y muestra tanto su valor como su tipo.*/

        String name, respuesta;
        int num;
        boolean onoff = false;
        double dou;
        char cha;

        Scanner scn = new Scanner(System.in);
        Scanner rpt = new Scanner(System.in);

        System.out.println("Hola, ¿cómo te llamas?");
        name = scn.nextLine();

        System.out.println("¿Cuántos años tienes?");
        num = scn.nextInt();

        System.out.println("¿Eres un estudiante? (si/no)");
        respuesta = rpt.nextLine().trim().toLowerCase();

        //Modifico mi boolean segun la respuesta que se me dé
        if (respuesta.equals("sí") || respuesta.equals("si")){
            onoff = true;
        } else if (respuesta.equals("no")){
            onoff = false;
        } else {
            System.out.println("Respuesta no válida. Se asumirá que no eres estudiante.");
        }

        System.out.println("¿Cuál es tu estatura?");
        dou = scn.nextDouble();

        cha = name.charAt(0);

        //-----------------------------------------------------------------------------

        System.out.println("Nombre: " + name + " - Tipo: String");
        System.out.println("Edad: " + num + " - Tipo: int");
        System.out.println("¿Es estudiante?: " + onoff + " - Tipo: boolean");
        System.out.println("Altura: " + dou + " - Tipo: double");
        System.out.println("Inicial: " + cha + " - Tipo: char");


    }

}
