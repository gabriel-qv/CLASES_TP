import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] palabras = {"sofia", "manta", "coche", "rueda"};
        String palabraSecreta = palabras[(int) (Math.random()*4)];
        String palabraUsuario;
        Scanner scr = new Scanner(System.in);

        System.out.println("La palabra a adivinar es " +palabraSecreta);
        int intentos = 5, acierto = 0;

        do{
            do{
                System.out.println("Introduce la palabra");
                palabraUsuario = scr.nextLine().trim();
            } while (palabraUsuario.length() != 5);
            intentos--;
            System.out.println("Intentos restantes: " + intentos);

            int aprox = 0, errores = 0;
            acierto = 0;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraUsuario == palabraSecreta){
                    acierto = 5;
                    System.out.println("Palabra adivinada");
                    break;
                } else if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)){
                    acierto++;
                } else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))){
                    aprox++;
                } else {
                    errores++;
                }
            }
            System.out.println("Número de aciertos: " + acierto);
            System.out.println("Número de aproximaciones: " + aprox);
            System.out.println("Número de errores: " + errores);
        } while (intentos>0 && acierto != 5);
    }
}
