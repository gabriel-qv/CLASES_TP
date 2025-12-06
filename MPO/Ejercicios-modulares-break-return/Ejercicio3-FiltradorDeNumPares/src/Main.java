public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        mostrarPares(numeros);
    }
    public static void mostrarPares(int[] numerosM){
        int contador = 0;
        for (int i = 0; i < numerosM.length; i++) {
            if (numerosM[i]%2 == 0){
                contador++;
                continue;
            }
        }
        System.out.println("Hay " + contador + " numeros pares");
    }
}
