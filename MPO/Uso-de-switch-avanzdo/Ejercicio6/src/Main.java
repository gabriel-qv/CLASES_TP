import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numeroDelMetodo = numeroRandom();
        if (numeroDelMetodo <= 5 && numeroDelMetodo >=0){
            System.out.println("Es de madrugrada");
        } else if (numeroDelMetodo <= 11) {
            System.out.println("Mañana");
        } else if (numeroDelMetodo <=19) {
            System.out.println("Tarde");
        } else if (numeroDelMetodo <= 23) {
            System.out.println("Noche");
        } else {
            System.out.println("Imposible...");
        }
        System.out.println(numeroDelMetodo);
    }
    public static int numeroRandom(){
        Random random = new Random();
        int numeroMensaje = random.nextInt(24);
        return numeroMensaje;
    }
}
