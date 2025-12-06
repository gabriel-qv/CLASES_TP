public class Main {
    public static void main(String[] args) {
        int[][] original = new int[3][4];
        int[][] transpuesta = new int[4][3];
        int valor = 1;

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                original[i][j] = valor++;
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("======================");

        for (int i = 0; i < original[0].length; i++) {
            for (int j = 0; j < original.length; j++) {
                transpuesta[i][j] = original[j][i];
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

    }
}
