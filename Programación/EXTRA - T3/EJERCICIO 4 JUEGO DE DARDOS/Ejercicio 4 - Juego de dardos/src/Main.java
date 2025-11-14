import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        int turno = 0;
        ArrayList nomJugadores = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce el nombre del jugador " + (i+1) + ": ");
            String jugador = scr.nextLine();
            nomJugadores.add(jugador);
        }

        j1.setNombre(nomJugadores.get(0).toString());
        j2.setNombre(nomJugadores.get(1).toString());

        do{
            if (j1.resultado() == 0){
                System.out.println("¡El jugador " + j1.getNombreJugador() + " ha ganado!");
                break;
            }
            turno++;
            if (j2.resultado() == 0){
                System.out.println("¡El jugador " + j2.getNombreJugador() + " ha ganado!");
            }
            turno++;
            System.out.println("============ FIN JUGADA ============");
        } while (j1.resultado() > 0 && j2.resultado()> 0);

        System.out.println("Turnos totales: " + turno);

    }
}
