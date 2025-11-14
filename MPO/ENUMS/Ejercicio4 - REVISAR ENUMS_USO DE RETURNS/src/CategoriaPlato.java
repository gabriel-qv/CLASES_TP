public enum CategoriaPlato {
    ENTRADA("Sopa", "Papa Huancaina", "Tequeños"),
    PRINCIPAL("Lentejas", "Alverjas", "Seco de carne", "Arroz con pollo"),
    POSTRE("Gelatina", "Torta tres leches", "Flan"),
    BEBIDA("Inka Cola", "Coca Cola", "Jugo de maracuyá", "Chica", "Limonada");

    String[] opciones;
    CategoriaPlato(String... opcionesP){
        this.opciones = opcionesP;
    }

    public static CategoriaPlato eleccion(int respuesta){
        switch (respuesta){
            case 1->{
                return ENTRADA;
            }
            case 2->{
                return PRINCIPAL;
            }
            case 3->{
                return POSTRE;
            }
            case 4 ->{
                return BEBIDA;
            }
            default -> {
                return null;
            }
        }
    }


}
