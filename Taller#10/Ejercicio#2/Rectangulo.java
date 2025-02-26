// Clase Rectangulo que extiende de Figura
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor de Rectangulo
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea para Rectangulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
