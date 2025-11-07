import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String contraseña;
        int numeroCaracteres;
        boolean validado = false;
        boolean numeros = false;
        boolean letras = false;
        boolean caracteres = false;
        Scanner scr = new Scanner(System.in);

        System.out.println("Cree una contraseña");
        contraseña = scr.next();

        numeroCaracteres = contraseña.length();
        caracteres = numeroCaracteres >= 8;

        for (int i = 0; i < contraseña.length(); i++){
            if (Character.isDigit(contraseña.charAt(i))){
                numeros = true;
                break;
            }
        }

        for (int i = 0; i < contraseña.length(); i++){
            if (Character.isLetter(contraseña.charAt(i))){
                letras = true;
                break;
            }
        }

        if (numeros && caracteres && letras){
            validado = true;
            System.out.println("¿Tiene al menos 8 carácteres?: " + caracteres);
            System.out.println("¿Tiene al menos un número?: " + numeros);
            System.out.println("¿Tiene al menos una letra?: " + letras);
            System.out.println("Número de caracteres: " + caracteres);
            System.out.println("¿Contraseña válida? (Cumple todos los requisitos): " + validado);
        } else {
            validado = false;
            System.out.println("¿Tiene al menos 8 carácteres?: " + caracteres);
            System.out.println("¿Tiene al menos un número?: " + numeros);
            System.out.println("¿Tiene al menos una letra?: " + letras);
            System.out.println("Número de caracteres: " + numeroCaracteres);
            System.out.println("¿Contraseña válida? (Cumple todos los requisitos): " + validado);
            if (!caracteres) {
                System.out.println("No cumple con el mínimo de caracteres.");
            }
            if (!letras) {
                System.out.println("No contiene letras");
            }
            if (!numeros) {
                System.out.println("No contiene números.");
            }
        }

    }
}
