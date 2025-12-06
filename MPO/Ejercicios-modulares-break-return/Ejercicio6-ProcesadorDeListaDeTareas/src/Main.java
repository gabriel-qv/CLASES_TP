public class Main {
    public static void main(String[] args) {
        String[] tareas = new String[]{"com", "mat", "Leng URGENTE", "BBDD", "Prog URGENTE"};
        System.out.println(procesarTareas(tareas));
    }
    public static String procesarTareas(String[] tareasM){
        String tareaEncontrada = "";
        for (int i = 0; i < tareasM.length; i++) {
            if (tareasM[i].contains("URGENTE")){
                tareaEncontrada = tareasM[i];
                break;
            } else {
                tareaEncontrada = "No hay tareas URGENTES";
            }
        }
        return tareaEncontrada;
    }
}
