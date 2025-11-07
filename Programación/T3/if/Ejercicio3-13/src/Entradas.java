public class Entradas {
    boolean gratis, cinco, adultos, jubilados, martes, jueves;
    int precioFinal;

    public void buleanos(int respuestaEdad){
        gratis = respuestaEdad < 12;
        cinco = respuestaEdad >= 12 && respuestaEdad <= 17;
        adultos = respuestaEdad >= 18 && respuestaEdad <= 64;
        jubilados = respuestaEdad > 65;

        System.out.println("¿Eres menor de 12 años?: " + gratis);
        System.out.println("¿Edad entre 12 y 17?: " + cinco);
        System.out.println("¿Edad entre 18 y 64?: " + adultos);
        System.out.println("¿Eres mayor de 65 años?: " + jubilados);
    }

    public int precios(int respuestaDias){
        martes = respuestaDias == 2;
        jueves = respuestaDias == 4;

        if (gratis){
            precioFinal = 0;
            System.out.println("Entrada gratis.");
        } else if (cinco && martes) {
            precioFinal = 0;
            System.out.println("¿Es Martes? " + martes);
            if (cinco && respuestaDias != 2){
                precioFinal = 5;
                System.out.println("¿Es Martes? " + martes);
            }
        } else if (adultos && jueves) {
            precioFinal = 7;
            System.out.println("¿Es Jueves? " + jueves);
            if (cinco && respuestaDias != 4){
                precioFinal = 10;
                System.out.println("¿Es Jueves? " + jueves);
            }
        } else if (jubilados) {
            precioFinal = 6;
        }

        return precioFinal;
    }

}
