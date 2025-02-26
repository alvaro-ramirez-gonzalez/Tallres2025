public class PrinCipal {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Figura triangulo = new Triangulo(5, 10);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}