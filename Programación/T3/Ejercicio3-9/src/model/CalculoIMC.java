package model;

public class CalculoIMC {
    public void calculo (double resultadoImc) {
    if (resultadoImc >= 50){
        System.out.printf("IMC = %.2f %n", resultadoImc);
        System.out.println("Tienes DOBLE OBESIDAD MÓRBIDA (V)");
    } else if (resultadoImc >= 40) {
        System.out.printf("IMC = %.2f %n", resultadoImc);
        System.out.println("Tienes OBESIDAD MÓRBIDA (III)");
    } else if (resultadoImc >= 35) {
        System.out.printf("IMC = %.2f %n", resultadoImc);
        System.out.println("Tienes OBESIDAD GRAVE (II)");
    } else if (resultadoImc >= 30) {
        System.out.printf("IMC = %.2f %n", resultadoImc);
        System.out.println("Tienes OBESIDAD MODERADA (I)");
    } else if (resultadoImc >= 25) {
        System.out.printf("IMC = %.2f %n", resultadoImc);
        System.out.println("Tienes SOBREPESO");
    } else if (resultadoImc >= 18.5) {
        System.out.printf("IMC = %.2f %n", resultadoImc);
        System.out.println("Tienes PESO NORMAL");
    } else {
        System.out.printf("IMC = %.2f %n", resultadoImc);
        System.out.println("Por debajo del peso NORMAL");
    }
    }
}
