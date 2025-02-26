

public class Ejemplo{
    // Clase base 1
public class ClaseA {
    public void metodoA() {
        System.out.println("Método de ClaseA");
    }
}

// Clase base 2
public class ClaseB {
    public void metodoB() {
        System.out.println("Método de ClaseB");
    }
}

// Clase derivada (incorrecta)
// public class ClaseC extends ClaseA, ClaseB { // Error de compilación
// }

// Clase base con atributo privado
public class Vehiculo {
    @SuppressWarnings("unused")
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }
}

// Clase derivada (incorrecta)
public class Coche extends Vehiculo {
    public Coche(String marca) {
            super(marca);
           
        }
    
        public void mostrarMarca() {
        // System.out.println(marca); // Error de compilación: 'marca' tiene acceso privado
    }
}

}