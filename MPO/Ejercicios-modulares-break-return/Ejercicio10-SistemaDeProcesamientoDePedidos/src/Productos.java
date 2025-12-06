public enum Productos {
    Mouse(20, 12.5), Teclado(25, 20.5),
    Pantalla(15, 65.7), Grafica (10, 100.50),
    MousePad (35, 7), Case(16, 55.1);
    int cantidad;
    double precio;
    Productos(int cantidad, double precio){
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
