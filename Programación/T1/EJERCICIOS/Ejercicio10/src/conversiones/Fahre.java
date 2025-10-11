package conversiones;

public class Fahre {
    public void celsius (double num1){
        double num2;
        num2 = (5*num1 - 160)/9;
        System.out.println("Temperatura en Fahrenheit: °" + num1);
        System.out.println("Conversión a Celsius: °" + num2);
    }

    public void kelvin (double num1){
        double num2;
        num2 = (5*num1 - 160)/9 + 273;
        System.out.println("Temperatura en Fahrenheit: °" + num1);
        System.out.println("Conversión a Kelvin: " + num2);
    }

    public void rankine (double num1){
        double num2;
        num2 = num1 + 459.67;
        System.out.println("Temperatura en Fahrenheit: °" + num1);
        System.out.println("Conversión a Rankine: °" + num2);
    }
}
