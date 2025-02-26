//Definir Métodos Abstractos que No Son Sobrescritos Compila pero es incorrecto
public class SegundoEjemplo {
    

    // Clase abstracta
public abstract class Vehiculo {
    public abstract void encender(); // Método abstracto
}

// Clase derivada que no sobrescribe el método abstracto
//public class Bicicleta extends Vehiculo {
    // Aunque no sobrescribimos el método encender, el código compila, pero es una mala práctica.
    // Bicicleta no tiene sentido implementar un método encender, pero aún así la clase debería sobrescribir el método abstracto.
//}
}
