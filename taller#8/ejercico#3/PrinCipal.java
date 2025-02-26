    public class PrinCipal {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 3000);
        Gerente gerente = new Gerente("Ana", 5000, "Ventas");

        empleado.mostrarDetalles();
        gerente.mostrarDetalles();
    }
}