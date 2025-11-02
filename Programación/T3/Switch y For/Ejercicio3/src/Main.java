import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numDatos;
        double numDouble1 = 0;
        double numDouble2 = 0;
        String rpta;
        Scanner scr = new Scanner(System.in);

        System.out.println("""
                Ingrese la operación que desea realizar
                1. Multiplicación (*)
                2. División (/)
                3. Suma (+)
                4. Resta (-)
                """);
        rpta = scr.nextLine().toLowerCase().trim();

        System.out.println("Ingrese la cantidad de datos que desea ingresar");
        numDatos = scr.nextInt();

        switch (rpta){
            case "multiplicación":
            case "1":
            case "*":
                System.out.println("======== MULTIPLICACIÓN ========");
                System.out.println("Ingrese el número");
                numDouble1 = scr.nextDouble();
                for (int i = 1; i <= numDatos-1; i++) {
                    System.out.println("Ingrese el siguiente número");
                    numDouble2 = scr.nextDouble();
                    numDouble1 *= numDouble2;
                }
                System.out.println("Resultado: " + numDouble1);
                break;
            case "division":
            case "2":
            case "/":
                System.out.println("======== DIVISIÓN ========");
                System.out.println("Ingrese el número");
                numDouble1 = scr.nextDouble();
                for (int i = 1; i <= numDatos-1; i++) {
                    System.out.println("Ingrese el siguiente número");
                    numDouble2 = scr.nextDouble();
                    numDouble1 /= numDouble2;
                }
                System.out.println("Resultado: " + numDouble1);
                break;
            case "sumar":
            case "3":
            case "+":
                System.out.println("======== SUMA ========");
                System.out.println("Ingrese el número");
                numDouble1 = scr.nextDouble();
                for (int i = 1; i <= numDatos-1; i++) {
                    System.out.println("Ingrese el siguiente número");
                    numDouble2 = scr.nextDouble();
                    numDouble1 += numDouble2;
                }
                System.out.println("Resultado: " + numDouble1);
                break;
            case "restar":
            case "4":
            case "-":
                System.out.println("======== RESTA ========");
                System.out.println("Ingrese el número");
                numDouble1 = scr.nextDouble();
                for (int i = 1; i <= numDatos-1; i++) {
                    System.out.println("Ingrese el siguiente número");
                    numDouble2 = scr.nextDouble();
                    numDouble1 -= numDouble2;
                }
                System.out.println("Resultado: " + numDouble1);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
