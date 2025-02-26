    public class Persona {
    
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

// Definición de la clase Estudiante, que hereda de Persona
class Estudiante extends Persona {
    String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);  // Llamamos al constructor de Persona
        this.matricula = matricula;
    }

    // Método para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Matrícula: " + matricula);
    }
}
