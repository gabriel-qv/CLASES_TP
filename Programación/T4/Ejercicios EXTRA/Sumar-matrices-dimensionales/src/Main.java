public class Main {
    public static void main(String[] args) {
        int tam = 4;
        int[][] matrizA = new int[tam][tam];
        int[][] matrizB = new int[tam][tam];
        int[][] sumaMatrices = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matrizA[i][j] = (int) (Math.random()*20+1);
                matrizB[i][j] = (int) (Math.random()*20+1);
                sumaMatrices[i][j] = matrizA[i][j] + matrizB[i][j];
            }
            System.out.println();
        }

        for (int[] fila : matrizA) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("===================");
        for (int[] fila : matrizB) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("===================");
        for (int[] fila : sumaMatrices) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }
}
