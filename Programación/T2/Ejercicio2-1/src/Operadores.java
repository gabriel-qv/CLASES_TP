public class Operadores {
    public void sumar(double op1, double op2){
        double resultado = op1 + op2;
        System.out.println("Suma: " + resultado);
    }

    public void restar(double op1, double op2){
        double resultado = op1 - op2;
        System.out.println("Resta: " + resultado);
    }

    public void multiplicacion(double op1, double op2){
        double resultado = op1 * op2;
        System.out.println("Multiplicación: " + resultado);
    }

    public void division(double op1, double op2){
        double resultado = op1/op2;
        System.out.println("División: " + resultado);
    }

    public void modulo(double op1, double op2){
        double resultado = op1%op2;
        System.out.println("Módulo (resto):" + resultado);
    }

}
