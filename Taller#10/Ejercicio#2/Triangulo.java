// Clase Triangulo que extiende de Figura
public class Triangulo extends Figura {
    private double base;
    private double altura;

    // Constructor de Triangulo
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea para Triangulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
