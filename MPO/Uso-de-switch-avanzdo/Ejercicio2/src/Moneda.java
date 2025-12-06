public enum Moneda {
    DOLAR(1.10),
    LIBRA(0.88),
    YEN(160.20),
    SOLES(4.05);

    double tasaConversion;
    Moneda(double tasaConversion){
        this.tasaConversion = tasaConversion;
    }

    public double conversionEuros(double euros){
        return euros * tasaConversion;
    }

    public double getTasaConversion() {
        return tasaConversion;
    }
}
