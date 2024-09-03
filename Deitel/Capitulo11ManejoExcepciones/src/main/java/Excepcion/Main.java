package Excepcion;

// Definición de la superclase ExcepcionA
class ExcepcionA extends Exception {
    public ExcepcionA(String message) {
        super(message);
    }
}

// Definición de la subclase ExcepcionB que hereda de ExcepcionA
class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String message) {
        super(message);
    }
}

// Definición de la subclase ExcepcionC que hereda de ExcepcionB
class ExcepcionC extends ExcepcionB {
    public ExcepcionC(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Lanzar una excepción de tipo ExcepcionC
            throw new ExcepcionC("Excepcion de tipo ExcepcionC atrapada por ExcepcionA");
        } catch (ExcepcionA e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}
