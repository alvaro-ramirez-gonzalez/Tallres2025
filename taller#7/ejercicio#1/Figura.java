
abstract class Figura {
    // Método abstracto
    public abstract double calcularArea();
    
    // Método concreto que muestra el área
    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}
// Clase abstracta Figura
// Clase derivada Circulo
class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase derivada Rectangulo
class Rectangulo extends Figura {
    private double largo;
    private double ancho;
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}

