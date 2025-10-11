package conversiones;

public class Rankine {
    public void celsius (double num1){
        double num2;
        num2 = 5*(num1 - 492)/9;
        System.out.println("Temperatura en Rankine: °" + num1);
        System.out.println("Conversion a Celsius: °" + num2);
    }

    public void fahrenheit (double num1){
        double num2;
        num2 = num1 - 460;
        System.out.println("Temperatura en Rankine: °" + num1);
        System.out.println("Conversion a Fahrenheit: °" + num2);
    }

    public void kelvin(double num1){
        double num2;
        num2 = 5*(num1 - 492)/9 + 273;
        System.out.println("Temperatura en Rankine: °" + num1);
        System.out.println("Conversion a Kelvin: °" + num2);
    }
}
