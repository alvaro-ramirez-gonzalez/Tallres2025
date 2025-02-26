    public class Vehiculo {
    
    String marca;
    int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}

    // Definición de la clase Coche, que hereda de Vehiculo
    class Coche extends Vehiculo {
    int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);  // Llamamos al constructor de Vehiculo
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}


