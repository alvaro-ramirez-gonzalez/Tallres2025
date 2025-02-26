public class PrinCipal {
        public static void main(String[] args) {
            Empleado gerente = new Gerente(5000, 1000);
            gerente.mostrarDetalles();
            
            Empleado vendedor = new Vendedor(3000, 500);
            vendedor.mostrarDetalles();
        }
    }
    

