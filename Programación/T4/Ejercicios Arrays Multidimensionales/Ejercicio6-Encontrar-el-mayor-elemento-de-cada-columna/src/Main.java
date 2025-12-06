public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        int numeroMayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*20+1);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        for (int col = 0; col < matriz[0].length; col++) {
            int mayor = matriz[0][col];

            for (int fila = 0; fila < matriz.length; fila++) {
                if (mayor<matriz[fila][col]){
                    mayor = matriz[fila][col];
                }
            }

            System.out.println("El mayor de la columna " + col + " es: " + mayor);
        }
    }
}
