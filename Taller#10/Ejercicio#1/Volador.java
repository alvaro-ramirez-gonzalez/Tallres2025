public interface Volador {
    void volar();

    public interface Nadador {
        void nadar();
    }

    public class Pato implements Volador, Nadador {
        @Override
        public void volar() {
            System.out.println("El pato está volando.");
        }
    
        @Override
        public void nadar() {
            System.out.println("El pato está nadando.");
        }
    }

    public class PrinCpal {
        public static void main(String[] args) {
            Pato pato = new Pato();
            pato.volar();
            pato.nadar();
        }
    }

}
