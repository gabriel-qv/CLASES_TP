import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase = "Hola que tAl malos como estan todos esperO que bien hijos de ###";
        String[] prohibidos = new String[]{"###", "malos"};
        int longitudMinima = 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingresa la longitud mínima");
        longitudMinima = scr.nextInt();

        System.out.println("Cantidad de vocales encontradas: " + contieneVocales(frase));
        System.out.println("Contiene palabra prohibida: " + contienePalabraProhibida(frase, prohibidos));
        System.out.println("La primera palabra que excede la Long. Min. es: " + primeraPalabraLarga(frase, longitudMinima));
    }

    public static int contieneVocales(String fraseM1){
        char c;
        int contador = 0;
        for (int i = 0; i < fraseM1.trim().toLowerCase().length(); i++) {
            c = fraseM1.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        return contador;
    }

    public static boolean contienePalabraProhibida(String fraseM2, String[] prohibidosM){
        boolean encontrado = false;
        for (int i = 0; i < prohibidosM.length; i++) {
            if (fraseM2.contains(prohibidosM[i])){
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public static String primeraPalabraLarga(String texto, int longitudMinimaM){
        String[] palabras = texto.split(" ");
        for (String palabra : palabras){
            if (palabra.length()>longitudMinimaM){
                return palabra;
            }
        }
        return null;
    }
}
