public enum CategoriaPlato {
    ENTRADA("Sopa", "Papa Huancaina", "Tequeños"),
    PRINCIPAL("Lentejas", "Alverjas", "Seco de carne", "Arroz con pollo"),
    POSTRE("Gelatina", "Torta tres leches", "Flan"),
    BEBIDA("Inka Cola", "Coca Cola", "Jugo de maracuyá", "Chicha", "Limonada");

    String[] opciones;
    CategoriaPlato(String... opcionesP){
        this.opciones = opcionesP;
    }

}
