import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String operacion;
        double num1, num2, total;
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduce la operación a reaizar");
        operacion = scr.nextLine();

        String[] partes = operacion.split(" ");

        num1 = Double.parseDouble(partes[0]);
        char operador = partes[1].charAt(0);
        num2 = Double.parseDouble(partes[2]);

        switch (operador){
            case '+'->{
                total = num1 + num2;
                System.out.println("Resultado: " + total);
            }
            case '-'->{
                total = num1 - num2;
                System.out.println("Resultado: " + total);
            }
            case '*'->{
                total = num1 * num2;
                System.out.println("Resultado: " + total);

            }
            case '/'->{
                if (num1 == 0 || num2 == 0){
                    System.out.println("Introduce un valor que no sea cero");
                } else {
                    total = num1 / num2;
                    System.out.println("Resultado: " + total);
                }
            }
            default -> {
                System.out.println("Introduce un operador válido (+. -. *. /)");
            }
        }
    }
}
