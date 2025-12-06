import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EstadoPedido[] estados = EstadoPedido.values();
        int posicionAct;
        switch (numeroRandom()){
            case 1->{
                System.out.println("Estado del envio:");
                System.out.println(EstadoPedido.PENDIENTE);
                posicionAct = EstadoPedido.PENDIENTE.ordinal();
                System.out.println("Siguiente paso");
                System.out.println(estados[posicionAct+1]);
            }
            case 2->{
                System.out.println("Estado del envio:");
                System.out.println(EstadoPedido.PROCESANDO);
                posicionAct = EstadoPedido.PROCESANDO.ordinal();
                System.out.println("Siguiente paso");
                System.out.println(estados[posicionAct+1]);
            }
            case 3->{
                System.out.println("Estado del envio:");
                System.out.println(EstadoPedido.ENVIADO);
                posicionAct = EstadoPedido.ENVIADO.ordinal();
                System.out.println("Siguiente paso");
                System.out.println(estados[posicionAct+1]);
            }
            case 4->{
                System.out.println("Estado del envio:");
                System.out.println(EstadoPedido.EN_TRANSITO);
                posicionAct = EstadoPedido.EN_TRANSITO.ordinal();
                System.out.println("Siguiente paso");
                System.out.println(estados[posicionAct+1]);
            }
            case 5->{
                System.out.println("Estado del envio:");
                System.out.println(EstadoPedido.ENTREGADO);
            }
            default -> {
                System.out.println("Estado del envio:");
                System.out.println(EstadoPedido.CANCELADO);
            }
        }
    }

    public static int numeroRandom(){
        Random random = new Random();
        int numeroMensaje = random.nextInt(6)+1;
        return numeroMensaje;
    }
}
