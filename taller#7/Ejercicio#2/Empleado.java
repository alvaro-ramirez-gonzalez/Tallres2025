// Clase abstracta Empleado
abstract class Empleado {
    // Método abstracto
    public abstract double calcularSalario();
    
    // Método concreto que muestra los detalles
    public void mostrarDetalles() {
        System.out.println("El salario es: " + calcularSalario());
    }
}

// Clase derivada Gerente
class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(double salarioBase, double bono) {
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

// Clase derivada Vendedor
class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;

    public Vendedor(double salarioBase, double comision) {
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}
    