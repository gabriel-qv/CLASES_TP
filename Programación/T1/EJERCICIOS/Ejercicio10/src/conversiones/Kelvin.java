package conversiones;

public class Kelvin {
    public void celsius (double num1){
        double num2;
        num2 = num1 - 273;
        System.out.println("Temperatura en Kelvin: " + num1);
        System.out.println("Conversión a Celsius: °" + num2);
    }

    public void fahrenheit (double num1){
        double num2;
        num2 = 9*(num1 - 273)/5 + 32;
        System.out.println("Temperatura en Kelvin: " + num1);
        System.out.println("Conversión a Fahrenheit: °" + num2);
    }

    public void rankine (double num1){
        double num2;
        num2 = num1 * 9/5;
        System.out.println("Temperatura en Kelvin: " + num1);
        System.out.println("Conversión a Rankine: °" + num2);
    }
}
