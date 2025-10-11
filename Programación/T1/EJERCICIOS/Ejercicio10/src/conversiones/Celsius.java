package conversiones;

public class Celsius {
    public void fahrenheit (double num1){
        double num2;
        num2 = (9*num1)/5 + 32;
        System.out.println("Temperatura en Celsius: " + num1);
        System.out.println("Conversión a Fahrenheit: °" + num2);
    }

    public void kelvin (double num1){
        double num2;
        num2 = num1+273;
        System.out.println("Temperatura en Celsius: " + num1);
        System.out.println("Conversión a Kelvin: " + num2);
    }

    public void rankine (double num1){
        double num2;
        num2 = (num1 + 273.15) * 9/5;
        System.out.println("Temperatura en Celsius: " + num1);
        System.out.printf("Conversión a Rankine: °" + num2);
    }

}
