public class Main {
    public static void main(String[] args) {

    }
    public static boolean verificarStick(int cantidad, int stock){
        if (cantidad > stock){
            return false;
        }
        return true;
    }
    public static double calcularDescuento(double precio, int cantidad){
        if (cantidad >= 20){
            precio=precio*0.7;
        } else if (cantidad>=15) {
            precio=precio*0.8;
        } else if (cantidad>=10) {
            precio=precio*0.9;
        } else {
            precio=precio*1;
        }
        return precio;
    }
    public static void procesarPedido(String[] productos, int[] cantidades, double[] precios){

    }
}
