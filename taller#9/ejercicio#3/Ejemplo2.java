public class Ejemplo2 {
    
public interface Corredor {
    void correr();
}

// Clase incorrecta que implementa la interfaz pero no tiene lógica relacionada
public class Arbol implements Corredor {
    @Override
    public void correr() {
        // El árbol no tiene una lógica para correr, lo cual no tiene sentido
        System.out.println("Los árboles no pueden correr.");
    }
}


public class prueba {
    public static void main(String[] args) {
        //Arbol arbol = new Arbol();
        //arbol.correr(); // Salida: Los árboles no pueden correr.
    }
}
}
