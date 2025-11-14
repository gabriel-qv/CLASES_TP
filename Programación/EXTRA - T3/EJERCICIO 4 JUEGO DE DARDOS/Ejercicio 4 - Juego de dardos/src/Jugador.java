
public class Jugador {
    String nombreJugador;
    int puntos = 301;

    public void setNombre(String entradaNombre){
        nombreJugador = entradaNombre;
    }
    public String getNombreJugador(){
        return nombreJugador;
    }

    public int resultado(){
        int lanzamiento = 0;
        int puntoTurno = 0;
        System.out.println(nombreJugador + " lanza sus dardos...");
        do{
            puntoTurno += (int)(Math.random()*61);
            lanzamiento++;
        } while (lanzamiento<3);
        System.out.println("Obtiene " + puntoTurno);
        System.out.println("Puntos actuales: " + puntos);
        if ((puntos-puntoTurno)<0){
            System.out.println("Siguiente jugador. No se obtiene puntos.");
        } else {
            puntos -= puntoTurno;
            System.out.println("Nuevos puntos: " + puntos);
        }
        System.out.println("------------ FIN TURNO ------------");
        return puntos;
    }




}
