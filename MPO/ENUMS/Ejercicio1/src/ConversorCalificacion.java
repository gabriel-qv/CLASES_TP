public enum ConversorCalificacion {
    A ("¡Nota Excelente!"), B("¡Aprobaste!"), C("Debemos mejorar.."), D("Pudiste haberlo hecho mejor,"), F("Desaprobaste :(");
    String mensaje;
    ConversorCalificacion (String mensajeP){
        mensaje = mensajeP;
    }
}
