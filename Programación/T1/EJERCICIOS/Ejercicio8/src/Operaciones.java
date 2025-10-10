public class Operaciones {

    public void cua (double num1){
        double area = num1*num1;

        System.out.println("El área del cuadrado es " + area);
    }

    public void rec (double num1, double num2){
        double area = num1*num2;

        System.out.println("El área del rectángulo es " + area);
    }

    public void tri (double num1, double num2){
        double area = (num1*num2)/2;

        System.out.println("El área del triángulo es " + area);
    }

    public void cir (double num1){
        final double pi = 3.14;
        double area = num1*num1*pi;

        System.out.println("El área del circulo es " + area);
    }

}
