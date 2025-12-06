public class Main {
    public static void main(String[] args) {
        int[] edades = new int[]{4,9,-4,-2,0,125,100,95,64,37,17,18,54,20,-5,121,120};
        System.out.println("Num. de edades válidas: " + mostrarEdadesValidas(edades));
    }
    public static int mostrarEdadesValidas(int[] edadesM){
        int contador = 0;
        for (int item : edadesM) {
            if (item<0 || item>120){
                continue;
            } else {
                contador++;
            }
        }
        return contador;
    }
}
