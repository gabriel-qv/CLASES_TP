public class Main {
    public static void main(String[] args) {
        int[][] original = new int[4][5];

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                original[i][j] = (int)(Math.random() * 40) + 1;
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }

        int pares = 0, impares = 0;

        for (int[] filas : original){
            for (int columna : filas){
                if (columna%2==0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("Pares: " + pares + " | Impares: " + impares);
    }
}
