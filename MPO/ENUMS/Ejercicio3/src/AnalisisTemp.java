public enum AnalisisTemp {
    HELADO("Hace muchisimo frío"), FRIO("Hace frío"),
    TEMPLADO("El clima está templado"), CALOR("Hace calor"),
    MUY_CALIENTE("Hace demasiado calor");

    final String mensaje;
    AnalisisTemp(String mensajeP){
        this.mensaje = mensajeP;
    }

    public String getMensaje() {
        return mensaje;
    }

    public static AnalisisTemp metodoMensaje (int analisisV){
        String mensaje;
        if (analisisV<0){
            return HELADO;
        } else if (analisisV<16) {
            return FRIO;
        } else if (analisisV<26) {
            return TEMPLADO;
        } else if (analisisV<36) {
            return CALOR;
        } else {
            return MUY_CALIENTE;
        }
    }


}
