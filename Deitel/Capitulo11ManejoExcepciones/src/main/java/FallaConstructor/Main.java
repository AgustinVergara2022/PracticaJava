package FallaConstructor;


class UnaClase {
    public UnaClase() throws Exception {
        // Simulación de una condición que causa una excepción en el constructor
        throw new Exception("¡Fallo en el constructor de UnaClase!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Intentar crear un objeto de tipo UnaClase
            UnaClase objeto = new UnaClase();
        } catch (Exception e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}
