public class Main {
    public static void main(String[] args) {
        double[] notas = new double[]{-5,4,5,78,10,25,2,9,5,7,-5,0};
        System.out.println("Promedio de notas: " + calcularPromedio(notas));

    }
    public static double calcularPromedio(double[] notasM){
        int contador = 0;
        double suma = 0;
        for (int i = 0; i < notasM.length; i++) {
            if (notasM[i] <= 10 && notasM[i]>=0){
                contador++;
                suma += notasM[i];
            } else {
                continue;
            }
        }
        double promedio = suma/contador;
        return promedio;
    }
}
